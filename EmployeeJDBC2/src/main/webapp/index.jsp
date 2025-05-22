
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<html>
<body>
<h2>Enter Employee Details</h2>
<form method="post">
  Emp No: <input type="text" name="empno"/><br/>
  Name: <input type="text" name="empname"/><br/>
  Basic Salary: <input type="text" name="salary"/><br/>
  <input type="submit" value="Insert"/>
</form>

<%
if(request.getParameter("empno") != null) {
    int empno = Integer.parseInt(request.getParameter("empno"));
    String empname = request.getParameter("empname");
    int salary = Integer.parseInt(request.getParameter("salary"));

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

    PreparedStatement ps = con.prepareStatement("INSERT INTO Emp VALUES (?, ?, ?)");
    ps.setInt(1, empno);
    ps.setString(2, empname);
    ps.setInt(3, salary);

    int i = ps.executeUpdate();
    if(i > 0) out.println("Employee inserted successfully.");

    con.close();
}
%>
</body>
</html>