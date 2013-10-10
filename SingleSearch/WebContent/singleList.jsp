<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<s:form action="ShowSingle">
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Sex</th>
			<th>&nbsp;</th>
		</tr>
		<s:iterator value="singles">
			<tr>
				<td><s:property value="firstName"/></td>
				<td><s:property value="lastName"/></td>
				<td><s:property value="sex"/></td>
				<s:url id="detailURL" action="ShowSingle">
					<s:param name="singleId" value="id"/>
				</s:url>
				<td><s:a href="%{detailURL}">Details</s:a></td>
			</tr>
		</s:iterator>
	</table>
	<s:submit value="Register"/>
</s:form>
