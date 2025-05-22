/*6c. Build a servlet program to check the given number is prime number or not using HTML with step
by step procedure.*/
package Java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CheckPrimeServlet")
public class CheckPrimeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Handle GET requests gracefully by forwarding to doPost (or showing a message)
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Option 1: Forward GET to POST
        doPost(request, response);

        // Or Option 2: Show message
        /*
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>Please submit the form via POST method.</h3>");
        out.println("<a href=\"index.html\">Go Back to form</a>");
        out.println("</body></html>");
        */
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));

            boolean isPrime = true;
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println("<html><body>");
            out.println("<h2>Prime Number Checker Result</h2>");
            out.println("<p>Number entered: " + number + "</p>");
            if (isPrime) {
                out.println("<p><b>" + number + " is a Prime Number.</b></p>");
            } else {
                out.println("<p><b>" + number + " is NOT a Prime Number.</b></p>");
            }
            out.println("<a href=\"index.html\">Try another number</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            out.println("<html><body>");
            out.println("<p>Invalid input. Please enter a valid integer number.</p>");
            out.println("<a href=\"index.html\">Go back</a>");
            out.println("</body></html>");
        }
    }
}