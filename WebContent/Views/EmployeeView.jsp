<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@ page import="EmployeeAssign.EJBs.Session.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
EmployeeDirectoryProxyWSLocator locator = new EmployeeDirectoryProxyWSLocator();
System.out.println("hello 1");
System.out.println(locator);
EmployeeListProxy remote = locator.getEmployeeListProxyImpPort();
System.out.println("hello 2");
System.out.println(remote);
System.out.println("hello 3");
System.out.println("hello 4");

EmployeeBean e=remote.getEmployee(request.getParameter("id"));
PhonenumberBean p=remote.getOfficePhonenumber(request.getParameter("id"));
LocationBean l=remote.getOfficeLocation(request.getParameter("id"));
EmployeeBean s=remote.getSupervisorDetails(request.getParameter("id"));
%>
<h2><%=e.getFirstname() %> <%=e.getMiddlename() %> <%=e.getLastname() %></h2> 
<div>
<strong>Employee Information </strong>
<p>
ID : <%=e.getId() %><br/>
Email : <%=e.getEmail() %><br/>
Job Title : <%=e.getJobtitle() %><br/>
</p>
</div>
<div>
<strong>Supervisor Information </strong><br/>
<p>
<%=s.getFirstname() %> <%=s.getMiddlename() %> <%=s.getLastname() %> <br/>
Email : <%=s.getEmail() %><br/>
Job Title : <%=s.getJobtitle() %>
</p>
</div> 
<div>
<strong> Office Information</strong>
<p>
<b>Employee Office Address :</b><br/>
Street : <%=l.getStreet() %><br/>
City : <%=l.getCity() %><br/>
County : <%=l.getCounty() %><br/>
State : <%=l.getState() %><br/>
Zip : <%=l.getZip() %><br/>
<b>Employee Office Phone Number</b><br/>
Number : <%=p.getNumber() %>
</p>
</div>
