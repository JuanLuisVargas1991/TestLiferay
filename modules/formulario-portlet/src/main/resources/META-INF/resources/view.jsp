<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<aui:form action="<%= renderResponse.createActionURL() %>" method="post" name="fm">
    <aui:input name="nombre" label="Nombre" required="true" />
    <aui:input name="email" label="Email" required="true" type="email" />
    <aui:button type="submit" value="Enviar" />
</aui:form>
