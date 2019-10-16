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
Update Dept
</h2>
<html:form action="/update_dude">
<% String aa=(String) session.getAttribute("dept_id");%>
<html:text property="id" value="<%=aa%>"/>
<% String bb=(String) session.getAttribute("dept_name");%>
<html:text property="name" value="<%=bb%>"/>
<% String cc=(String) session.getAttribute("dept_region");%>
<html:text property="region_id" value="<%=cc%>"/>
<html:submit />
</html:form>

</body>
</html>
