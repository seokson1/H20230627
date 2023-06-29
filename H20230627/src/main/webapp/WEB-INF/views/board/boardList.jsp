<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table class="table">
	<thead>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="board" items="${board }">
		<tr>
		<td><c:out value="${board.brdNo }"></c:out></td>
		<td><c:out value="${board.brdTitle }"></c:out></td>
		<td><c:out value="${board.brdWriter }"></c:out></td>
		<td><c:out value="${board.clickCnt}"></c:out></td>
		</tr>
		
		</c:forEach>
	</tbody>
</table>