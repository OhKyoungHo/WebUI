$(document).ready(function(){
	//+버튼 누를때마다 폰트사이즈 커지게 하기
	//$('fontSize >button:first')	
	$("div>dl dd>button:contains('+')").click(function(){
		$('#txt').css({fontSize : '+=1px'})
		})	
	//-버튼 누를때마다 폰트사이즈 작아지게 하기	
	//$('fontSize >button:last')	
	$("div>dl dd>button:contains('-')").click(function(){
		$('#txt').css({fontSize : '-=1px'})//id가 txt 찾기
		})	
	
	$("#fontstyle").change(function(){
		$('#txt').css({
		'font-family': $(this).val()})	
		//font-family: 선택된 요소에 우선 순위가 지정된 font family 이름과 generic family 이름을 지정할 수 있게 해줍
		})	
});