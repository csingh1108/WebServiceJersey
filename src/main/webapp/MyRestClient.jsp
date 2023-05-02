<%@page import="com.estore.test.TestClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyRestClient</title>
</head>
<body>
	<h3>Testing Restful Service</h3>
	<%!
		TestClient client = new TestClient();
	%>
	Plain Response: <%= client.getPlainResponse() %>

</body>
</html>