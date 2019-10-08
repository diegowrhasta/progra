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
ALTAS
<br>
DEPARTAMENTOS
</h2>
<html:form action="/altadep">
<bean:message key="cod.prompt" />
<html:text property="cod" />
<bean:message key="descripcion.prompt" />
<html:text property="descripcion" />
<bean:message key="region.prompt" />
<html:text property="region" />
<html:submit />
</html:form>
</body>
</html>
