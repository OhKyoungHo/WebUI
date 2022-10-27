$(function(){
	// 첫번째 <a>를 찾아서 prettyPopin 실행
	$('a[rel ="prettyPopin"]:eq(0)').prettyPopin({width:500});
	//$('a[rel ="prettyPopin"]:first').prettyPopin({width:500});
	// 두번째 <a>를 찾아서 prettyPopin 실행
	$('a[rel ="prettyPopin"]:eq(1)').prettyPopin({
	//속성명 : 속성값
	width		: 500, 
	//callback : 어떤 이벤트에 의해서 불러지는 함수
	callback 	: function(){
						alert('팝업이 닫힙니다.')
				  }
	
	});
	//$('a[rel ="prettyPopin"]:last').prettyPopin({width:500});
})