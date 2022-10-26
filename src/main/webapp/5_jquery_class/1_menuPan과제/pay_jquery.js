$(function(){
	
	var totalVal = $("#total", opener.document).val();
   	$('#pay_total').val(totalVal);
   
   
  
   var total = $(".list", opener.document);
   
 
	
	total.each(function(){
		var tr=$('<tr/>');		 
		var td = $(this).find('td'); // -> $('td') 
		
		var pName = td.eq(0).text();
		tr.append($('<td/r>').text(pName));				//메뉴 td에 이름 붙이기
		
		var pCount = td.eq(2).text();
		tr.append($('<td/>').text(pCount));				//수량 td에 갯수 붙이기		
		
		var pPrice = td.eq(4).text();
		tr.append($('<td/>').text(pPrice));				//가격 붙이기
		
		tr.attr('class','list');
		$('table#payTable').append(tr);					//붙인 내역들을 테이블에 붙이기
	});
	
	$('.payButton').click(function(){
		
		res = confirm('영수증을 출력 하시겠습니까?');			//결제 여부를 묻는 알림창 출력
		if(res){												//확인을 눌렀을 경우
			alert('영수증이 출력됩니다.');
		}
		alert('결제가 완료되었습니다. 처음 화면으로 돌아갑니다.');
		
		
		$('.list', opener.document).remove();								//추가한 tr 모두 삭제
		$('#total', opener.document).attr('value',0);						//최종금액 내용 0으로 설정
		$('.menuCount', opener.document).val('0');							//메뉴 수량을 표시하는 값을 0으로 설정
		$(opener.location).attr("href","home.html"); 
		window.close();
	})
	
})