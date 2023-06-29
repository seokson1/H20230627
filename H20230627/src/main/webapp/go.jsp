<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>

<body>
	<h3>검색조건</h3>
	시도:
	<select id="search">
		
		</select>
	<button id="searchBtn">조회</button>
	<div id="show">
		<table border="1">
			<thead>
				<tr>
					<th>센터id</th>
					<th>센터명</th>
					<th>연락처</th>
					<th>시도</th>
					<th>우편번호</th>
				</tr>
			</thead>
			<tbody id="list">

			</tbody>
		</table>
	</div>

	<script>
		let totalData = [];
		let url =
			`https://api.odcloud.kr/api/15077586/v1/centers?page=1&perPage=284&serviceKey=DtbMQfOnwpOH58UO78q3Kpnb8e2V4FIlXGIX0Hu9K3m%2FMTJcXi%2FIPYjnAcUL9mHjnfqoZbJP3uADc6UMGy803w%3D%3D`;
		let xhtp = new XMLHttpRequest();
		xhtp.open('get', url);
		xhtp.send();

		xhtp.onload = function () {
			let tbody = document.getElementById('list');
			let data = JSON.parse(xhtp.responseText);
			console.log(data.data);
			totalData = data.data;
			for (let i = 0; i < data.data.length; i++) {
				tbody.appendChild(makeRow(data.data[i]));
			}
			let sidoAry = [];

			for(let result of totalData) {
				if(sidoAry.indexOf(result.sido) == -1) {
					sidoAry.push(result.sido);
				} 
			}
			console.log(sidoAry);
			for(let sido of sidoAry) {
				let option = document.createElement('option');
				option.value = sido;
				option.innerText = sido;
				let search = document.getElementById('search');
				search.appendChild(option);
			}
		}
			//sido 정보 = > sidoAry 
			// totalData => [{},{}...{}]
			
		
		let fields = ['id', 'centerName', 'phoneNumber', 'sido', 'zipCode']

		function makeRow(obj = {}) {

			let tr = document.createElement('tr');

			for (let field of fields) {

				let td = document.createElement('td');

				if (field == 'centerName') {

					let ahref = document.createElement('a');
					ahref.href = 'map.jsp';
					ahref.setAttribute('href', 'map.jsp?lat=' + obj.lat + '&lng=' + obj.lng); // ahref.href = 'map.jsp';
					ahref.target = "_blank";
					ahref.innerText = obj[field];

					td.appendChild(ahref);

				} else {

					td.innerText = obj[field];

				}

				tr.appendChild(td);

			}

			return tr;

		}


		document.querySelector('#searchBtn').addEventListener('click', findFnc2);
		let arys = [];

		function findFnc2() {
			document.getElementById('list').innerHTML = "";

			let tbody = document.getElementById('list');
			console.log(totalData);
			//1. 기존목록 clear 2. 입력값 비교 vs totalData 3. tbody.appendChild()

			for (let center of totalData) {
				if (center.sido == document.getElementById('search').value) {
					document.getElementById('list').appendChild(makeRow(center));
				}
			}

		}

		function findFnc1() {

			let trs = document.querySelectorAll('tbody tr');
			let ary = [];

			for (let tr of trs) {
				if (tr.children[3].innerText == document.getElementById('search').value) {
					ary.push(tr);
				}
			}
			console.log(ary);
			//
			document.getElementById('list').innerHTML = "";
			for (let tr of ary) {
				document.getElementById('list').appendChild(tr);
			}
		}
	</script>

</body>

</html>