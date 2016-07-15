package mypkg.model;

public class Join02 {
	//필요한 멤버들만 다시 작성하는 예시
	private String mname ; //회원 이름
	private String pname ; //상품 이름
	private int qty ; //판매된 수량
	private int price ; //상품의 단가
	private int amount ; //판매 금액
	
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Join02 [mname=" + mname + ", pname=" + pname + ", qty=" + qty
				+ ", price=" + price + ", amount=" + amount + "]";
	}	
}
