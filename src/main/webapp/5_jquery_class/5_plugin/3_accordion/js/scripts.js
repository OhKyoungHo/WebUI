$(function(){
	$('.accordion').accordion({
		heightStyle : 'content',	//칸의 높이를 내용 높이에 맞게 조절
		event : 'mouseover',		//마우스 올리는 곳마다 이벤트 발생
		active : 2					//3번째 칸이 활성화된 상태로
	});
})