<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
 
</head>
<body>
   <form:form method="POST" action="welcome.do"  modelAttribute="regUser">
     <table align="center" bgcolor="lightgreen">
     
         <tr>
         <td>E_ID</td>
         <td><form:input path="ID"/></td>
       
       </tr>       
<tr>
         <td>Email</td>
         <td><form:input path="Email"/></td>
       
       </tr>
       <tr>
         <td>Name</td>
         <td><form:input path="Name"/></td>
        
       </tr>
       <tr>
         <td>password</td>
         <td><form:password path="password"/></td>
        
       </tr>
         <tr>
         <td>Address</td>
         <td><form:input path="Address"/></td>
       </tr>
       <tr>
<td><input type="submit" value="submit"  /></td>
</tr>
     </table>
   </form:form>  
</body>
</html>