$(document).ready(function(){
	
	$('p#intro').animate({
		padding :'20px', 	//안쪽여백
		fontSize : '30px'
	},2000);	
	
	$('#navigation>ul>li').hover(function(){
		$(this).animate({paddingLeft:'+=15px'},200);//기존값에서 15px 더하기
	}, function(){
		$(this).animate({paddingLeft:'-=15px'},200);//옮긴위치에서 -15px 더하기
	});
	
	//고정 퀵메뉴 원리
	$(window).scroll(function(){
		$('#navigation').css({'top' : $(document).scrollTop()});	//'#navigation'을 가진 퀵메뉴가 해당 위치에 고정하게 만듦	
		
	});
	
	
});