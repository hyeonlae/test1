package mypkg.model;

public class Join02 {
	//�ʿ��� ����鸸 �ٽ� �ۼ��ϴ� ����
	private String mname ; //ȸ�� �̸�
	private String pname ; //��ǰ �̸�
	private int qty ; //�Ǹŵ� ����
	private int price ; //��ǰ�� �ܰ�
	private int amount ; //�Ǹ� �ݾ�
	
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
