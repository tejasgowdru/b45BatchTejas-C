<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./InsertData" method="post">
<p>ID:</p>
<!--  Create an element with mandatory name attribute,
so that data can be transfer to the servelt using getParameter() -->
<input type="text" name="id"/>
<br/>
<p>String:</p>
<input type="text" name="string"/>
<br/><br/><br/>
<input type="submit"/>
</form>

</body>
</html>