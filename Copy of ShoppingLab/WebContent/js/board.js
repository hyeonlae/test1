function boardCheck() {
	if (document.frm.writer.value.length == 0) {
		alert("작성자를 입력하세요.");
		document.frm.writer.focus();
		return false;
	}
	if (document.frm.password.value.length == 0) {
		alert("비밀번호를 입력하세요.");
		document.frm.password.focus();
		return false;
	}
	if (document.frm.subject.value.length == 0) {
		alert("제목을 입력하세요.");
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
		alert("비밀번호를 입력하세요.");
		document.frm.password.focus();
		return false;
	}
	return true;
}