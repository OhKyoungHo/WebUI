$(function(){
	//1)오늘날짜 표시 (10)
	var date = new Date();		//오늘날짜 가져오기
	var year = date.getFullYear();//년
	var month=date.getMonth()+1//월
    var date=date.getDate();//일
    //각 년, 월, 일 붙이기
    $('.year').text(year)
    $('.month').text(month)
    $('.date').text(date)
    
 //2) 포커스 가면 ‘검색어를 입력하세요’를 안보이고 다시 포커스가 없으면 다시 출력 (10점)
 //focus :  마우스 포인터가 대상 엘리먼트에 위치할때 이벤트를 처리
 $('#keyword').focus(function(){
		$(this).css('background','url("") '); 
	})
//blur : 대상 엘리먼트가 포커스를 잃었을 때 이벤트를 처리	
 $('#keyword').blur(function(){
		$(this).css('background','url("images/sch_guide.gif") no-repeat'); 
	})

//3) 탭팬 구현 (10점)
 
	$('#tabmenu').each(function(){
		//dt를 가진 것들을 모아서 allDt에 저장
		var allDt = $(this).find('dt')
		//dd를 가진 것들을 모아서 allDd에 저장
		var allDd = $(this).find('dd')
		
		//각 탭을 눌렀을때
		allDt.click(function(){
			allDd.hide(); //dd 전체 닫기
			$(this).next().show(); //이벤트 발생한것만 열기
		})
	})
//첫번째 탭을 클릭했을때
	$('.tab_btn1 img').click(function(){   
			//첫번째 탭의 파일 이름을 바꾸기(켜져있는 상태)
	      $(this).attr('src', $(this).attr('src').replace('out','over'));
	      //두번째 탭의 파일 이름을 바꾸기(꺼져있는 상태)
	      $('.tab_btn2 img').attr('src','images/tab_btn_2_out.gif');
	      //두번째 탭의 파일 이름을 바꾸기(꺼져있는 상태)
	      $('.tab_btn3 img').attr('src','images/tab_btn_3_out.gif');
	})
//두번째 탭을 클릭했을때	
	$('.tab_btn2 img').click(function(){
		  //두번째 탭의 파일 이름을 바꾸기(켜져있는 상태)
		  $(this).attr('src', $(this).attr('src').replace('out','over'));
		  //첫번째 탭의 파일 이름을 바꾸기(꺼져있는 상태)
		  $('.tab_btn1 img').attr('src','images/tab_btn_1_out.gif');
		  //세번째 탭의 파일 이름을 바꾸기(꺼져있는 상태)
	      $('.tab_btn3 img').attr('src','images/tab_btn_3_out.gif');
	})
//세번째 탭을 클릭했을때		
	$('.tab_btn3 img').click(function(){   
		  //세번째 탭의 파일 이름을 바꾸기(켜져있는 상태)
	      $(this).attr('src', $(this).attr('src').replace('out','over')); 
	      //첫번째 탭의 파일 이름을 바꾸기(꺼져있는 상태)
	      $('.tab_btn1 img').attr('src','images/tab_btn_1_out.gif');
	      //세번째 탭의 파일 이름을 바꾸기(꺼져있는 상태)
	      $('.tab_btn2 img').attr('src','images/tab_btn_2_out.gif');
	})

 //(4) 이미지슬라이드 구현 (10점)

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
   	//'<' 버튼을 누르면 뒤로 이동
    $('.prev_btn img').on('click', function() {
		slider.goToPrevSlide(); 	
	});
	//'>' 버튼을 누르면 앞으로 이동
	$('.next_btn img').click(function() {
		slider.goToNextSlide();
	});

 
 //(5) [로그인]을 누르면 로그인 창이 보이고 [Close]를 누르면 다시 안 보임  (20점)
   //[로그인]을 누르면 로그인 창이 보이기
   $('.login_wrap > a > img').click(function(){
      $('#login_f').css("top","20px");      
   })
   //[Close]를 누르면 다시 안 보이기
   $('.login_close_btn > a > img').click(function(){
      $('#login_f').css("top","-250px");
   })
 
 // (6) [전체메뉴]를 선택하면 전체메뉴가 보이고 [Close] 누르면 다시 안 보임(20) 
   $('#total_btn > a > img').click(function(){
      $('#total_menu').show();
   })
   $('#total_close > a > img').click(function(){
      $('#total_menu').hide();
   })
 
 //(7) 프린트 버튼을 누르면 인쇄창이 뜸(20점)
   $('.print_btn').click(function(){
	 window.print();
   })
   
   // 기능 1 : 상담시간 아니라는 문구 출력
      $('img[alt="출판상담문의 02-3235-1722"]').click(function(){ // 상담 문의 배너 눌렀을 때,
   		alert("현재는 상담 시간이 아닙니다.");      // 해당 문구 출력
   			})
      
      // 기능 2 : 알림판 1234 사진 변경
      $("#roll_banner_wrap img").each(function() { // 해당 탭(사진) 눌렀을 때, 
         $(this).click(function(){
         var src = $("#roll_banner_wrap img[src*='over']");   // img 속성 중 over 들어가는 요소 확인 
         var ori=src.attr("src").replace("over","out");      // 속성 값 over -> out 변경 (빨간색-> 흰색)
            let thissrc = $(this).attr("src");               // 클릭한 탭의 속성 저장
            
            $("#roll_banner_wrap dd").hide();         // 전체 탭의 내용 다 닫음
             $(this).closest("dt").next().show();       // 클릭한 탭의 내용 표현
            src.attr("src",ori);                  // 속성 값 over -> out 변경 (빨간색-> 흰색) 
            
            $(this).attr("src",thissrc.replace("out","over")) // 해당 속성 out -> over 변경 ( 흰색 -> 빨간색)  탭 눌린 느낌 줌
     		 	}) // 클릭 탭 닫음
    		 })   // 개별 each 문 닫음
   
   
	
})