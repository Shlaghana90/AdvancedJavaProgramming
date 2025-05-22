<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*, java.util.*" %>
<html>
<head>
    <title>Insert Employee</title>
</head>
<body>
    <h2>Insert Employee Record</h2>

    <form method="post">
        Emp No: <input type="text" name="empno" /><br />
        Emp Name: <input type="text" name="empname" /><br />
        Basic Salary: <input type="text" name="basicsalary" /><br />
        <input type="submit" value="Insert Employee" />
    </form>

    <%
        String empno = request.getParameter("empno");
        String empname = request.getParameter("empname");
        String basicsalary = request.getParameter("basicsalary");

        if (empno != null && empname != null && basicsalary != null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/Employee";
                String user = "root";
                String password = "";

                Connection conn = DriverManager.getConnection(url, user, password);

                String query = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setInt(1, Integer.parseInt(empno));
                pstmt.setString(2, empname);
                pstmt.setInt(3, Integer.parseInt(basicsalary));
                pstmt.executeUpdate();

                out.println("<h3>Salary Report</h3><hr>");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

                while (rs.next()) {
                    out.println("Emp No: " + rs.getInt("Emp_NO") + "<br>");
                    out.println("Emp Name: " + rs.getString("Emp_Name") + "<br>");
                    out.println("Basic Salary: " + rs.getInt("Basicsalary") + "<br><hr>");
                }

                rs.close(); stmt.close(); pstmt.close(); conn.close();
            } catch (Exception e) {
                out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
            }
        }
    %>
</body>
</html>
