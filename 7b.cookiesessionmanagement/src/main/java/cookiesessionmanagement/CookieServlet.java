package cookiesessionmanagement;

	import java.io.*;
	import javax.servlet.*;
	import javax.servlet.http.*;
	import javax.servlet.annotation.WebServlet;

	@WebServlet("/CookieServlet")
	public class CookieServlet extends HttpServlet {

	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();

	        String userName = request.getParameter("userName");
	        Cookie[] cookies = request.getCookies();

	        int visitCount = 0;
	        String existingUser = null;

	        if (cookies != null) {
	            for (Cookie c : cookies) {
	                if ("user".equals(c.getName())) {
	                    existingUser = c.getValue();
	                }
	                if ("visitCount".equals(c.getName())) {
	                    try {
	                        visitCount = Integer.parseInt(c.getValue());
	                    } catch (NumberFormatException e) {
	                        visitCount = 0;
	                    }
	                }
	            }
	        }

	        if (userName != null && !userName.trim().isEmpty()) {
	            existingUser = userName.trim();
	            visitCount = 1;

	            Cookie userCookie = new Cookie("user", existingUser);
	            userCookie.setMaxAge(60); // 60 seconds
	            userCookie.setPath("/");

	            Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));
	            visitCookie.setMaxAge(60);
	            visitCookie.setPath("/");

	            response.addCookie(userCookie);
	            response.addCookie(visitCookie);
	        } else if (existingUser != null) {
	            visitCount++;
	            Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));
	            visitCookie.setMaxAge(60);
	            visitCookie.setPath("/");
	            response.addCookie(visitCookie);
	        }

	        out.println("<html><head><title>Cookie Example</title></head><body>");

	        if (existingUser != null) {
	            out.println("<h2 style='color:blue;'>Welcome back, " + existingUser + "!</h2>");
	            out.println("<h3 style='color:green;'>You have visited this page " + visitCount + " times!</h3>");
	            out.println("<p><i>Note: Cookie expires in 60 seconds.</i></p>");
	            out.println("<form method='post' action='CookieServlet'>");
	            out.println("<input type='submit' value='Logout (Clear Cookies)'>");
	            out.println("</form>");
	        } else {
	            out.println("<h2>Welcome Guest!</h2>");
	            out.println("<form method='get' action='CookieServlet'>");
	            out.println("Enter your name: <input type='text' name='userName' required>");
	            out.println("<input type='submit' value='Submit'>");
	            out.println("</form>");
	        }

	        out.println("</body></html>");
	    }

	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        Cookie userCookie = new Cookie("user", "");
	        userCookie.setMaxAge(0);
	        userCookie.setPath("/");

	        Cookie visitCookie = new Cookie("visitCount", "");
	        visitCookie.setMaxAge(0);
	        visitCookie.setPath("/");

	        response.addCookie(userCookie);
	        response.addCookie(visitCookie);

	        response.sendRedirect("CookieServlet");
	    }
	}
