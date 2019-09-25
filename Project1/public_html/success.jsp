<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<h2>
Hello <%=session.getAttribute("usuario")%>!
</h2>
<html:form action="/menu">
<html:submit property="boton" value="ALTA" />
<html:submit property="boton" value="BAJA" />
<html:submit property="boton" value="MODIFICACION" />
</html:form>



