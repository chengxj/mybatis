<%@include file="include/header.jspf" %>
<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8"%>
<c:set var="ngApp" value="app"/>
<c:set var="ngController" value="ctrl"/>
<table border=1>
<tr>
<td>${activities.id}</td>
<td>${activities.title}</td>
<td>${activities.leader}</td>
</tr>
</table>
</body>
</html>