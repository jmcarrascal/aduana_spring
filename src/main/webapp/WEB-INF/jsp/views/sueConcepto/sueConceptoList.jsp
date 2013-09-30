<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<h1>SueConcepto List</h1>
 
	<c:forEach items="${sueConceptoList}" var="sueConcepto">
		${sueConcepto.descripGral}&nbsp;/${sueConcepto.sueConceptoAplicacion.descrip}
		<br/>
		
	</c:forEach>
 
 </body>
</html>