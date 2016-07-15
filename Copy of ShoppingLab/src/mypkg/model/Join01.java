package mypkg.model;

public class Join01 {
	//객체 변수들을 멤버 변수로 만드는 예시
	//사용되지 않는 변수들에 대한 메모리가 낭비될 수 있다.	
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