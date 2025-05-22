

//6b. Build a servlet program to create a cookie to get your name through text box and press submit
//button( through HTML) to display the message by greeting Welcome back your name ! , you have
//visited this page n times ( n = number of your visit ) and demonstrate the expiry of cookie also.package com.cookieservlet;
package com.cookieservlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Step 3: Handle GET requests (Form Submission or Page Reload)
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Step 4: Get submitted name
        String userName = request.getParameter("userName");

        // Variables to track cookies
        String existingUser = null;
        int visitCount = 1;

        // Step 5: Check existing cookies
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("user".equals(cookie.getName())) {
                    existingUser = cookie.getValue();
                }
                if ("visits".equals(cookie.getName())) {
                    try {
                        visitCount = Integer.parseInt(cookie.getValue()) + 1;
                    } catch (NumberFormatException e) {
                        visitCount = 1;
                    }
                }
            }
        }

        // Step 6: If user entered name, treat it as a new session
        if (userName != null && !userName.isEmpty()) {
            existingUser = userName;
            visitCount = 1;

            Cookie userCookie = new Cookie("user", userName);
            Cookie visitCookie = new Cookie("visits", String.valueOf(visitCount));

            userCookie.setMaxAge(60); // expires in 60 sec
            visitCookie.setMaxAge(60);

            response.addCookie(userCookie);
            response.addCookie(visitCookie);
        } else if (existingUser != null) {
            // Refresh visit count
            Cookie visitCookie = new Cookie("visits", String.valueOf(visitCount));
            visitCookie.setMaxAge(60); // reset expiry
            response.addCookie(visitCookie);
        }

        // Step 7: Show response
        out.println("<html><body>");

        if (existingUser != null) {
            out.println("<h2 style='color:blue;'>Welcome back, " + existingUser + "!</h2>");
            out.println("<h3 style='color:green;'>You have visited this page " + visitCount + " times.</h3>");
            out.println("<form method='post' action='CookieServlet'>");
            out.println("<input type='submit' value='Logout'>");
            out.println("</form>");
        } else {
            out.println("<h2>Welcome Guest!</h2>");
            out.println("<form method='get' action='CookieServlet'>");
            out.println("Enter your name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        }

        out.println("<p><small>Note: Cookies expire in 60 seconds. Try refreshing after 1 minute to reset the visit count.</small></p>");
        out.println("</body></html>");
    }

    // Step 8: Handle POST request (Logout)
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Delete cookies by setting max age to 0
        Cookie userCookie = new Cookie("user", "");
        Cookie visitCookie = new Cookie("visits", "");

        userCookie.setMaxAge(0);
        visitCookie.setMaxAge(0);

        response.addCookie(userCookie);
        response.addCookie(visitCookie);

        // Redirect back to form
        response.sendRedirect("CookieServlet");
    }
}