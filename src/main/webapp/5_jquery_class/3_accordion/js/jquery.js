 $(function(){
	$('.accordion').each(function(){
		//각 accordian 에서 작동하기 위해서 $(this) 사용
		var allDt = $(this).find('dt');
		var allDd = $(this).find('dd');		
		
		//모든 dd들을 숨기기
		allDd.hide();
		//dd 중에서 첫번째 dd만 보이게 하기
		allDd.first().show();
		
		//마우스를 올렸을때 손모양으로 바꾸기
		allDt.css({'cursor': 'pointer'});
		
		//dt를 클릭했을때 전부다 숨기고 이벤트만 발생한 부분만 열게 만들기
		allDt.click(function(){
			allDd.hide();
			$(this).next().show();//다음 dd 열기
			//toggle, fadeIn, slideDown 다른 것들도 적용가능
		});

	})
	
})
 