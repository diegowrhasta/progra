<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<script language="JavaScript" src="jscript/valida.js"></script>
<script language="JavaScript" src="jscript/alta.js"></script>
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
<html:form action="/altadep" onsubmit="return fParams( )">
<bean:message key="cod.prompt" />
<html:text property="cod" onkeypress="EvaluateText('%d', this)" />
<bean:message key="descripcion.prompt" />
<html:text property="descripcion" />
<html:select property="region">
<html:options collection="ayuda" property="codigo" labelProperty="descr" />
</html:select>

<html:submit />
</html:form>
</body>
</html>
