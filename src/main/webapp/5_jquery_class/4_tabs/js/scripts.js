 $(function(){
	var topDiv = $('.tabSet');
	var anchors = topDiv.find('ul.tabs>li>a');
	var panelDivs = topDiv.find('div.panels>div.panel');
	
	anchors.show();
	panelDivs.hide();

	var lastAnchors = anchors.filter('.on');
	var lastPanel = $(lastAnchors.attr('href'));
	//href 속성을 가진 것을 객체로 만들기
	//만약 $()가 없으면 그냥 글씨에 불과함
	//첫번째 panel에 있는 내용 보여주기
	lastPanel.show();
	
	//위의 탭을 누를때마다 내용 바꾸기
	anchors.click(function(){		
		//anchors = topDiv.find('ul.tabs>li>a');
		var currentAnchor = $(this);
		var currentPanel = $(currentAnchor.attr('href'));
		
		lastPanel.hide();	
		currentPanel.show();
		//해당과정까지 탭을 누르면 탭의 색깔은 바뀌지 않고 내용만 변경
		//but 내용이 추가 되거나 섞이는 오류 발생
		
		//탭 누를때 탭 색깔 바꾸기
		lastAnchors.removeClass('on');//전에 있던 클래스에서 on 없애기
		currentAnchor.addClass('on');//지금 클래스에 on 생성
		
		//탭 누를때 내용들 바꾸기
		lastAnchors = currentAnchor;
		lastPanel = currentPanel;
	})
	
	
})