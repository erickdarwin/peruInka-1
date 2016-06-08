<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Usuarios

<br>
<!-- <a href="frmPerson">Nueva Persona</a> -->
<br>

<display:table name="${listUserSystem}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
 	
	<display:column title="Usuario" property="userName" />
 	
	<display:column title="Nombres" property="person.name" />
	<display:column title="Ape Paterno" property="person.lastNameF" />
	<display:column title="Ape Paterno" property="person.lastNameM" />
	<display:column title="Tipo Documento" property="person.typeDocument" />
	<display:column title="Tipo Documento DESC" property="person.typeDocument.description" />
	<display:column title="Numero Documento" property="person.numDocument" />
	<display:column title="Estado" property="person.statusPerson.description" />
<%-- 	<display:column title="OPC"> --%>
<%-- 		<a href="editPerson?id_=${item.id}">Modificar</a> --%>
<%-- 		<a href="deletePerson?id_=${item.id}">Eliminar</a> --%>
<%-- 	</display:column> --%>
	
</display:table>