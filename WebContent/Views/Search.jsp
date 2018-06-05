<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Employee Search</h2>	
		
	<form  name="search" action="List.jsp" method="post">
		<table border="0" cellspacing="3" cellpadding="0" align="center">
			<tr>
				<td align="right"><label for="searchTerm" >Search Text :</label></td>
				<td align="left"><input name="searchTerm"  size="20" maxlength="70" /> </td>	
			</tr>
			<tr>
				<td align="right"><label for="searchType" >Search In :</label></td>
				<td align="left">
					<select name="searchType" >
						<option value="lastname" >Last Name</option>
						<option  value="firstname" >First Name</option>
						<option  value="phonenumbers" >Phone Number</option>						
					</select> 				 	
				</td>	
			</tr>				
		</table>
		<hr />
		<div align="center">
			<input type="submit" /> |
			<input type="reset" />
		</div>		
	</form>


</body>
</html>