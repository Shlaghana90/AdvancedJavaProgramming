<%--8c. Develop a JDBC project using JSP to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and
Generate the report as follows for the TABLE Emp (Emp_NO , Emp_Name, Basicsalary ) using
HTML and JSP to get the fields and display the results respectively --%>

<%@ page import="java.sql.*" %>
<html>
<head><title>Insert Employee</title></head>
<body>
    <h2>Insert Employee</h2>
    <form method="post" action="insertEmp.jsp">
        Emp No: <input type="number" name="empno" required><br/>
        Name: <input type="text" name="empname" required><br/>
        Basic Salary: <input type="number" name="salary" required><br/>
        <input type="submit" value="Insert">
    </form>

<%
String empno = request.getParameter("empno");
String empname = request.getParameter("empname");
String salary = request.getParameter("salary");
int total = 0;

if (empno != null && empname != null && salary != null) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
        PreparedStatement ps = con.prepareStatement("INSERT INTO Emp VALUES (?, ?, ?)");
        ps.setInt(1, Integer.parseInt(empno));
        ps.setString(2, empname);
        ps.setInt(3, Integer.parseInt(salary));
        ps.executeUpdate();

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Emp");
%>
        <hr><h3>Salary Report</h3>
<%
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            int sal = rs.getInt(3);
            total += sal;
%>
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br/>
        Emp_No : <%=id%><br/>
        Emp_Name : <%=name%><br/>
        Basic : <%=sal%><br/>
<%
        }
%>
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br/>
        <b>Grand Salary: <%= total %></b><br/>
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br/>
<%
        con.close();
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    }
}
%>
</body>
</html>
