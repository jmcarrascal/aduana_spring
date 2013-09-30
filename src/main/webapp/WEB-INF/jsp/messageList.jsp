<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<h1>Message List</h1>
 
	<c:forEach items="${messageList}" var="message">
		${message.descrip}
		<br />
	</c:forEach>
 
 </body>
</html>