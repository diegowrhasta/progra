<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
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
BAJA
</h2>
<html:form action="/baja">
<table border=1 width="100%" height="100%">
<logic:iterate id="tabla" indexId="index" name="bajas" property="tabla">
<tr>
<td>
<html:submit property="codigo">
<bean:write name="tabla" property="codigo" />
</html:submit>
</td>
<td>
<bean:write name="tabla" property="descr" />
</td>
</tr>
</logic:iterate>
</table>
</html:form>
</body>
</html>
