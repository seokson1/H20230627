/**
 * main.js 
 */

 console.log("main.js");
 
 let obj ={name: "홍길동", age:21, phone: "010-1111-2222"}
 console.log(obj.name, obj['age']);
 for(let prop in obj) {
	 console.log("속성: " + prop + ", 값: " + obj[prop]);
 }
  