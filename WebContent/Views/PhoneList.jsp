
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page import="EmployeeAssign.EJBs.Session.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>
</head>
<body>
<%
String message=null;
PhonenumberBean[] numbers=null;
try
{
EmployeeDirectoryProxyWSLocator locator = new EmployeeDirectoryProxyWSLocator();
System.out.println("hello 1");
System.out.println(locator);
EmployeeListProxy remote = locator.getEmployeeListProxyImpPort();
System.out.println("hello 2");
System.out.println(remote);
System.out.println("hello 3");
System.out.println("hello 4");
numbers=remote.getPhonenumbersList(request.getParameter("id"));
if(numbers==null)
{
	message="There Are no Records in the DB.";
}
}
catch(Exception ex)
{
ex.printStackTrace();	
}

%>
<h1 align="center">Employee Directory</h1>
<br>
<h2>Phone List</h2>
<br>
<c:url value="Search.jsp" var="listLink" />


<p>To View Employee List Search<a href="Search.jsp">Click Here</a></p><br><br>

<div>
<%if(message!=null){ %>
<%=message %>
<%} %>
		
<table align="center" width="80%" title="Current Employee List" border="2" cellpadding="2" >
<caption><strong>Employee Phone Number List</strong></caption>

<tr>
<th>Phone ID</th>
<th>Phone Number</th>
<th>Phone Type</th>
</tr>
<%
if(numbers!=null)
{
	for(PhonenumberBean p:numbers)
	{
%>									
				<tr>
					<td><%=p.getPhoneid() %></td>
					<td><%=p.getNumber() %></td>
					<td><%=p.getPhonetype() %></td>
					
				</tr>
<%}} %>
</table>

</div>
</body>
</html>