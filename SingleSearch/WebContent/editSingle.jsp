<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<s:form action="SaveSingle">
	<s:hidden name="single.id"/>
	<s:textfield name="single.firstName" label="First Name"/>
	<s:textfield name="single.lastName" label="Last Name"/>
	<s:radio name="single.sex" list="%{@de.nordakademie.singlesearch.model.Sex@values()}" label="Sex"/>
	<s:checkboxlist name="single.sexualOrientation" list="%{@de.nordakademie.singlesearch.model.Orientation@values()}" 
		label="Sexual Orientation"/>
	<s:select name="single.focus" multiple="true" size="5"
		list="%{@de.nordakademie.singlesearch.model.Focus@values()}" label="Focus"/>
	<s:submit value="Save"/>
	<s:submit value="Cancel" action="ShowSingleList"/>
</s:form>