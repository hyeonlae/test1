function boardCheck() {
	if (document.frm.writer.value.length == 0) {
		alert("�ۼ��ڸ� �Է��ϼ���.");
		document.frm.writer.focus();
		return false;
	}
	if (document.frm.password.value.length == 0) {
		alert("��й�ȣ�� �Է��ϼ���.");
		document.frm.password.focus();
		return false;
	}
	if (document.frm.subject.value.length == 0) {
		alert("������ �Է��ϼ���.");
		document.frm.subject.focus();
		return false;
	}
	return true;
}
function open_win(url, name) {
	alert( url );
	window.open(url, name, "width=500, height=230");
}
function passCheck() {
	if (document.frm.password.value.length == 0) {
		alert("��й�ȣ�� �Է��ϼ���.");
		document.frm.password.focus();
		return false;
	}
	return true;
}