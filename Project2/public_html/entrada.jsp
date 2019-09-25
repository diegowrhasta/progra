<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Hello World
</title>
</head>
<body>
<h2>
Entrada Joven: 
</h2>
<html:errors />
<html:form action="/entrada">
<bean:message key="idusuario.prompt" />

<html:text property="idusuario" />
<br> 
<bean:message key="clave.prompt" />
<html:password property="clave" />
<html:submit />


</html:form>

<p>
<%= new java.util.Date() %></p>
</body>
</html>
