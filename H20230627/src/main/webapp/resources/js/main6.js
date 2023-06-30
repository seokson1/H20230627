/**
 * main6.js
 */

document.querySelectorAll('#page-content-wrapper table')
	.forEach(function(tbl) {
		tbl.innerHTML = "";
});

document.querySelectorAll('#page-content-wrapper h3')
.forEach(function(elem){
	elem.remove();
})


const str = `Lorem ipsum dolor, sit amet consectetur adipisicing elit. Similique, animi, amet enim veritatis ipsa eum beatae, magni minus ratione autem quibusdam? Perferendis repellendus eos ad velit, repudiandae consequatur nemo nam.
`;

const strAry = str.split(' ');
let span = document.createElement('span');
let outer = document.querySelector('div.outer');
strAry.forEach(function(word){
    span = document.createElement('span');
    span.innerText = word;
    outer.appendChild(span);

})
/*let spanAll = document.querySelectorAll('span').values;
let userInput = document.getElementById('userInput');

document.getElementById('userInput').addEventListener('click', findFnc2);

function findFnc2() {
	document.getElementById('span');
	for(let wo of spanAll) {
		if(wo == document.getElementById('userInput').value) {
			document.getElementById('userInput').value.reomve();
		}
	}
}*/
// 입력값 span 찾아 지 우기
document.querySelector('#userInput').addEventListener('change', function() {
    let userVal = this.value;
    document.querySelectorAll('outer span').forEach(function(item){
        if(item.innerText == userVal) {
            item.remove();
        }
    })
    this.value = "";
})

