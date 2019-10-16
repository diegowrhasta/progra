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
MODIFICACIÓN
</h2>
<html:form action="/modificacion">
<html:select property="codigo">
<html:options collection="ayuda" property="codigo"/>
</html:select>
<html:submit />
</html:form>
</body>
</html>
