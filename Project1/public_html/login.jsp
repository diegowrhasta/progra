<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
<head>
<link rel="stylesheet" href="css/estilos.css" type="text/css"/>
</head>
<body>

<html:form action="/login">
<table width="350" align="center" class="boxdetail">
<tr>
<tr>
    <td colspan="2" align="center" class="boxhead">Ingreso al Sistema</td>
</tr>
<td><bean:message key="userid.prompt" /> :</td>
<td><html:text property="userid" /></td>
</tr>
<tr>
<td><bean:message key="password.prompt" /> :</td>
<td><html:password property="password" /></td>
</tr>
<tr>
    <td colspan="2" align="center" class="boton2"><html:submit value="Ingresar" /></td>
</tr>
</table>
</html:form> 
</body>
</html>
