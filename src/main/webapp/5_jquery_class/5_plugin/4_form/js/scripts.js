$(function(){
	$('#signup >form').validate({
		rules :{
			name : {required : true },
			email :{required : true, 
					email : true 		//이메일 양식이 아닌것은 걸러짐
			},
			website : {url : true},		//url 양식이 아닌것은 걸러짐
			password : {
				minlength:6,			//비밀번호 최소길이 6
				maxlength:12,			//비밀번호 최대길이 12
			},
			passconf : {equalTo :"#password"}	//비밀번호가 같지 않으면 걸러짐			
		},
		success : function(label){
			label.addClass('valid');
			label.text('성공');
		}
	});
	
	//-------------------------------------------
	//attr() → prop()
	
	//'위조항모두'를 눌렀을때
   $('.check-all').click(function(){
   /*
      var checked = $('.check-all').is(':checked');
      
      if(checked)
         $('.agree').prop('checked',true);
      else if(!checked)
         $('.agree').prop('checked',false);   
      */  
      //agree와 check-all이라는 클래스 이름을 가진 체크박스가 모두 체크된 상태로 바뀜 
      $('.agree').prop('checked', $('.check-all').is(':checked'));      
   })
   //각 조항 체크박스를 눌렀을 때
   $('.agree').click(function(){
   
         //$('input:checkbox[id="check-all"]').prop('checked',false);
		//위 조항 모두 체크박스가 체크되지 않은 상태로 바뀜
         $('.check-all').prop('checked',false);
      })




});

