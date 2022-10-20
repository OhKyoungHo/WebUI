window.onload = function(){

		//document.getElementById('pay');
		//var inputs = document.querySelectorAll("input");
		
		let adult = document.getElementById('adult');
		let child = document.getElementById('child');
		let baby = document.getElementById('baby');
		
		adult.onchange	= calc;	
		child.onchange 	= calc;
		baby.onchange 	= calc;
	
	function calc(){
		total.value = adult.value*39000 + child.value*29000 + baby.value*19000;
	}
	var btn = document.getElementById('frm');
		btn.onsubmit = function(evt){
			
			evt.stopPropagation();//다음 이벤트를 다른 서버로 전송하는 고유의 기능을 막아주는 역할
			evt.preventDefault();	
			
			//alert(frm.agree.checked);//동의하면 true,안하면 false
			if(!frm.checkboxchecked&&!frm.checkbox2.checked){
				alert('반드시 체크해주셔야만 합니다.');
				return;	//제출로 넘아가지 않도록 리턴으로 막아줌
			}
			
			btn.submit();
			
			
		}
	
	
	
}
		
		
		
