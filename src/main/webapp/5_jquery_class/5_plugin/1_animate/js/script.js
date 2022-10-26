$(function(){
	$('#bio>h3').css({'cursor': 'pointer'})

	//이미지 및 글 숨기기
	$('#bio>div').hide();

	//이미지 중에서 김수현 부분만 보이게 하기
	$('#bio>div:eq(0)').show();

	//이름을 클릭하면 해당 사진만 나오도록
	$('#bio>h3').click(function(){
	//전체 숨기고
		//$('#bio>div').hide();
	//다음꺼 보여주기	
		//$(this).next().show();
	//다음꺼 보여주기(애니메이션 효과 사용)	
		$(this).next().animate({'height': 'toggle'},1000,'easeOutBounce');
		
	});
})