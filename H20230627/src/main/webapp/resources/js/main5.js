/**
 * main.js5
 */
document.querySelectorAll('#page-content-wrapper table')
	.forEach(function(tbl) {
		tbl.innerHTML = "";
});

document.querySelectorAll('#page-content-wrapper h3')
.forEach(function(elem){
	elem.remove();
})

const array1 = ['a', 'b', 'c'];

array1.forEach(function(element, idx, ary) {
	console.log(element, idx, ary)
});


let btn = document.createElement('button');
btn.addEventListener('change', function(e){
	
})
document.getElementById('userInput').addEventListener('change', function(e){
	document.querySelector('input').enterKeyHint();
})
let input = document.querySelector('input.userInput').value;
let div = document.getElementsByClassName('outer');
let span = document.getElementById('span');
let inputDiv = input.appendChild(div);
inputDiv.appendChild(span);

