<%--9b. Read all the existing records from the table coffee which is from the database test and query
coffee name starting with ‘D’ in the table using HTML and JSP to get the field and display the
results respectively --%>

<%@ page import="java.sql.*" %>
<html>
<head><title>Query Coffee D</title></head>
<body>
<h2>Coffee Names Starting with 'D'</h2>
<%
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM coffee WHERE coffee_name LIKE 'D%'");
%>
<table border="1">
    <tr><th>ID</th><th>Name</th><th>Price</th></tr>
<%
    while (rs.next()) {
%>
    <tr>
        <td><%= rs.getInt("id") %></td>
        <td><%= rs.getString("coffee_name") %></td>
        <td><%= rs.getInt("price") %></td> 
    </tr>
<%
    }
    con.close();
} catch (Exception e) {
    out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
}
%>
</table>
</body>
</html>
