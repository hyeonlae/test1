package mypkg.model;

public class Join01 {
	//��ü �������� ��� ������ ����� ����
	//������ �ʴ� �����鿡 ���� �޸𸮰� ����� �� �ִ�.	
	private Member member ;
	private Board board ;
	
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	@Override
	public String toString() {
		return "Join01 [member=" + member + ", board=" + board + "]";
	}	
}