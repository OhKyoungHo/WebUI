$(function(){
	//1)오늘날짜 표시 (10)
	var date = new Date();
	var year = date.getFullYear();
	var month=date.getMonth()+1//월
    var date=date.getDate();//일
    
    $('.year').text(year)
    $('.month').text(month)
    $('.date').text(date)
    
 //2) 포커스 가면 ‘검색어를 입력하세요’를 안보이고 다시 포커스가 없으면 다시 출력 (10점)
 $('#keyword').focus(function(){
		$(this).css('background','url("") '); 
})
 $('#keyword').blur(function(){
		$(this).css('background','url("images/sch_guide.gif") no-repeat'); 
})

//3) 탭팬 구현 (10점)
 
	$('#tabmenu').each(function(){
		var allDt = $(this).find('dt')
		var allDd = $(this).find('dd')
		
		allDt.click(function(){
			allDd.hide(); //전체 닫기
			$(this).next().show(); //이벤트 발생한것만 열기
		})
	})

$('.tab_btn1 img').click(function(){   
	      $(this).attr('src', $(this).attr('src').replace('out','over'));
	      $('.tab_btn2 img').attr('src','images/tab_btn_2_out.gif');
	      $('.tab_btn3 img').attr('src','images/tab_btn_3_out.gif');
	})
	
	$('.tab_btn2 img').click(function(){
		  $(this).attr('src', $(this).attr('src').replace('out','over'));
		  $('.tab_btn1 img').attr('src','images/tab_btn_1_out.gif');
	      $('.tab_btn3 img').attr('src','images/tab_btn_3_out.gif');
	})
	$('.tab_btn3 img').click(function(){   
	      $(this).attr('src', $(this).attr('src').replace('out','over')); 
	      $('.tab_btn1 img').attr('src','images/tab_btn_1_out.gif');
	      $('.tab_btn2 img').attr('src','images/tab_btn_2_out.gif');
	})

 //(4) 이미지슬라이드 구현 (10점)
  $(function(){
      var slider = $('#best_bg>ul').bxSlider({
	auto:true,
    pager: true,
    controls: true,
    autoControls: true,
    minSlides: 5,
    maxSlides: 5,
    moveSlides: 1,
    slideWidth: 160,
    slideMargin: 10
    	  });
    $('#best_bg').css({ 'padding-left': '60px' }) // 이지스퍼블리싱 베스트 책
    $('#best_bg li').css({ 'padding-left': '5px' }) // 책 제목, 저자
   	
    $('.prev_btn img').on('click', function() {
		slider.goToPrevSlide(); 	
	});

	$('.next_btn img').click(function() {
		slider.goToNextSlide();
	});

      });
 
 //(5) [로그인]을 누르면 로그인 창이 보이고 [Close]를 누르면 다시 안 보임  (20점)
 
   $('.login_wrap > a > img').click(function(){
      $('#login_f').css("top","20px");      
   })
   
   $('.login_close_btn > a > img').click(function(){
      $('#login_f').css("top","-250px");
   })
 
 // 6. [전체메뉴]를 선택하면 전체메뉴가 보이고 [Close] 누르면 다시 안 보임(20) 
   $('#total_btn > a > img').click(function(){
      $('#total_menu').show();
   })
   $('#total_close > a > img').click(function(){
      $('#total_menu').hide();
   })
 
 //(7) 그 외 추가적으로 구현하면 해당 화면 캡쳐하고 코드를 작성합니다. (20점)
 

	
})