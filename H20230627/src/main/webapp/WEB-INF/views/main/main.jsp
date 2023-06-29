<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h3>Main Tiles</h3>

<table border="1" class="table">
	<tr>
		<th>이름</th>
		<td><input type="text" id="name" value="홍길동"></td>
	</tr>
	<tr>
		<th>나이</th>
		<td><input type="number" id="age" value="22"></td>
	</tr>
	<tr>
		<th>점수</th>
		<td><input type="number" id="score" value="80"></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<button class="btn btn-primary" id="saveBtn">저장</button>
		</td>
	</tr>
</table>

<h3>학생목록</h3>
<table id="list" border="1" class="table">
	<thead>
		<tr><th>이름</th><th>나이</th><th>점수</th><th>삭제</th></tr>
	</thead>
	<tbody id="target">

	</tbody>
</table>
<style>
	div.outer{
		display:inline-block;
		width: 700px;
		height: 500px;
		background-color: yellow;
	}
	.outer span{
		display: inline-block;
		width: 80px;
		height: 30px;
		margin: 2px;
		padding: 2px;
		background-color: aqua;
		text-align: center;
	}
</style>

<input type="text" id="userInput"><br>
<br>
<div class="outer">
	<span id="span">hello</span>
</div>


<script src="resources/js/main4.js"></script>