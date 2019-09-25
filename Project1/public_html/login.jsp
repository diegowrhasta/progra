<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:form action="/login">
<table border="0">
<tr>
<td><bean:message key="userid.prompt" /> :</td>
<td><html:text property="userid" /></td>
</tr>
<tr>
<td><bean:message key="password.prompt" /> :</td>
<td><html:password property="password" /></td>
</tr>
</table>
<html:submit />
</html:form> 


