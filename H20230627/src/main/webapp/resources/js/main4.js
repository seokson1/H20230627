/**
 * main.js4
 */
let jsonData = 
`[{"id":1,"first_name":"Jaime","last_name":"Henderson","email":"jhenderson0@eventbrite.com","gender":"Polygender","salary":2220},
{"id":2,"first_name":"Michelle","last_name":"Gonzalvo","email":"mgonzalvo1@macromedia.com","gender":"Female","salary":3195},
{"id":3,"first_name":"Gardner","last_name":"Rayne","email":"grayne2@i2i.jp","gender":"Male","salary":3552},
{"id":4,"first_name":"Conrade","last_name":"O'Curran","email":"cocurran3@jiathis.com","gender":"Male","salary":4533},
{"id":5,"first_name":"Rosaline","last_name":"McCathay","email":"rmccathay4@dion.ne.jp","gender":"Female","salary":3520},
{"id":6,"first_name":"Ramon","last_name":"Pischof","email":"rpischof5@mashable.com","gender":"Male","salary":4629},
{"id":7,"first_name":"Liesa","last_name":"Wadhams","email":"lwadhams6@nhs.uk","gender":"Female","salary":1366},
{"id":8,"first_name":"Lisha","last_name":"Yeeles","email":"lyeeles7@slideshare.net","gender":"Female","salary":4856},
{"id":9,"first_name":"Donelle","last_name":"Melmore","email":"dmelmore8@google.com.br","gender":"Female","salary":3498},
{"id":10,"first_name":"Oran","last_name":"Siddons","email":"osiddons9@t.co","gender":"Male","salary":3025},
{"id":11,"first_name":"Oralie","last_name":"Antoniewicz","email":"oantoniewicza@arizona.edu","gender":"Female","salary":1497},
{"id":12,"first_name":"Alethea","last_name":"Aleksic","email":"aaleksicb@dion.ne.jp","gender":"Female","salary":1965},
{"id":13,"first_name":"Cinda","last_name":"Gallehawk","email":"cgallehawkc@ameblo.jp","gender":"Female","salary":1274},
{"id":14,"first_name":"Jerrie","last_name":"Lenox","email":"jlenoxd@sphinn.com","gender":"Male","salary":2246},
{"id":15,"first_name":"Zebedee","last_name":"MacGaughey","email":"zmacgaugheye@wordpress.com","gender":"Male","salary":3048}]`;
//json 포멧 문자열 값 편하게 편하게 문자열 값으로 변환

let data = JSON.parse(jsonData);
console.log(data);

//비동기 방식.XMLHttpRequest()
let xhtp = new XMLHttpRequest();
xhtp.open('get', 'chartData.do'); // 서버 들어가는 요청 세팅 (요청방법, 요청주소)
xhtp.send(); // 실제 send 호출 되어야함. 실행됨
xhtp.onreadystatechange = function () { // 서버 요청 완료 상태 확인 정보 출력
	if(xhtp.readyState == 4 && xhtp.status == 200) {
		console.log(xhtp.responseText);
		let data = JSON.parse(xhtp.responseText);
		console.log(data);
	}

}