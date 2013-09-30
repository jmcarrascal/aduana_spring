<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>
<form:form commandName="sueConcepto" action="concepto/add" name="sueConceptoForm">
	<table>
		<tr>
			<td colspan="2" align="left"><form:errors path="*"
				cssStyle="color : red;" /></td>
		</tr>
		<tr>
			<td>Descrip :</td>
			<td><form:input path="descripGral" /></td>	
		</tr>
		<tr>
			<td>Tipo de Concepto :</td>
			<td><form:select items="${sueConceptoTipoList}" itemValue="tipoConceptoId" itemLabel="descrip" path="sueConceptoTipo.tipoConceptoId"  />
      		</td>
		</tr> 
		
		<tr>
			<td colspan="2"><input type="submit" value="Save Changes" /></td>
		</tr>
	</table>
</form:form>
</body>
</html>
