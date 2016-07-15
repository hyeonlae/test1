function idCheck(){
	var id = document.myform.id.value ;
	var url='idCheck.jsp?id=' + id ;
	window.open(url, 'mywin', 'height=120,width=285') ;
}
function zipCheck(){
	var url='zipCheck.jsp';
	window.open(url, 'mywin', 'height=300,width=540,status=yes,scrollbars=yes,resizable=no') ;
}
function dongCheck(){
	if (document.zipForm.dong.value == ""){
		alert("동이름을 입력해주세요.") ;
		document.zipForm.dong.focus() ;
		return false ;
	}
	//�Ϲ� ��ư���� ���� ȿ���� ������ submit()�� �̿��ϸ� �ȴ�.
	document.zipForm.submit() ;
}

function sendAddress(zipcode, address){	
	//opener : 나 자신을 open 시킨 창
	opener.document.myform.zipcode.value=zipcode;
	opener.document.myform.address1.value=address;
	opener.document.myform.address2.focus();
	self.close(); //self : 자기 자신을 의미
}







