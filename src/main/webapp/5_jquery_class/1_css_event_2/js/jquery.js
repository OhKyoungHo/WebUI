$(function() {
	$(".header .menu li img").hover(function() {
		var src = $(this).attr("src");//버튼에 올린다는 행동
		$(this).attr("src", src.replace("off", "on"));//행동에 따른 리액션
	}, function() {
		var src = $(this).attr("src");
		$(this).attr("src", src.replace("on", "off"));
	});
});

