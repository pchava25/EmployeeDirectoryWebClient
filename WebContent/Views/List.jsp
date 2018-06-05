<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="EmployeeAssign.EJBs.Session.EmployeeListProxy" %>
<%@ page import="EmployeeAssign.EJBs.Session.EmployeeDirectoryProxyWSLocator" %>
<%@ page import="EmployeeAssign.EJBs.Session.EmployeeDirectoryProxyWS" %>
<%@ page import="EmployeeAssign.EJBs.Session.EmployeeBean" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>
</head>
<body>
<h1 align="center">Employee Directory</h1>
<br>
<h2>Employee List</h2>
<br>


<%
String message=null;
EmployeeBean[]employees=null;

try
{
java.lang.String type=request.getParameter("searchType").toString();
java.lang.String term=request.getParameter("searchTerm").toString();
EmployeeDirectoryProxyWSLocator locator = new EmployeeDirectoryProxyWSLocator();
System.out.println("hello 1");
System.out.println(locator);
EmployeeListProxy remote = locator.getEmployeeListProxyImpPort();
System.out.println("hello 2");
System.out.println(remote);
System.out.println("hello term "+ term);
System.out.println("hello type "+ type);
System.out.println(remote.getEmployee("432156789"));
System.out.println("hello 3");
System.out.println(remote.search(type, term));
if(term=="")
{
	message="you did not enter any term.";
	employees=remote.getAllEmployees();
	}
else
{
System.out.println("hello 3");
 employees =remote.search(type, term);
}
System.out.println("hello 4");

if(employees==null)
{
	message="There Are no Records in the DB matching your search.";
}
}
catch(Exception e)
{
e.printStackTrace();	
}
%>

<p>To Search Employee Details <a href="Search.jsp">Click Here</a> </p><br><br>
<div><%if(message!=null){ %>
<%=message%>	
<%} %>	
<table align="center" width="80%" title="Current Employee List" border="2" cellpadding="2" >
<caption><strong>Current Employee List</strong></caption>
<tr>
<th>View</th>
<th>Last name</th>
<th>First name</th>
<th>Middle Initial</th>
<th>Email Address</th>
<th>Phone Number</th>
<th>Location</th>
</tr>
<%
if(employees!=null)
{
for(EmployeeBean e:employees)
{

%>

				<tr>
					
					<td><a href="EmployeeView.jsp?id=<%=e.getId() %>">View</a></td>
					<td><%=e.getLastname() %></td>
					<td><%=e.getFirstname() %></td>
					<td><%=e.getMiddlename() %></td>
					<td><%=e.getEmail() %></td>					
					<td><a href="PhoneList.jsp?id=<%=e.getId()%>">Phone Numbers</a></td>
					<td><a href="LocationList.jsp?id=<%=e.getId()%>">Locations</a></td>
				</tr>
			

<%
}
}
%></table>

</div>
</body>
</html>