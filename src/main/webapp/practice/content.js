/**
 * 
 */
 window.onload = function(){
	let con = document.getElementsByClassName("item");
	//클래스 이름을 공통적으로 item으로 해서 반복문을 이용
	for(let i=0 ;i<con.length;i++){
		con[i].onclick = function(evt){
			alert('ok~');
			let conprice = evt.target.getAttribute('data-price'); //getAttribute : 해당 요소에 지정된 값을 반환 
			alert(conprice);
		}
	}
}