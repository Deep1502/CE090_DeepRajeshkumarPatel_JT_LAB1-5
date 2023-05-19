
public class Bill extends Family implements java.io.Serializable{

	static final long serialVersionUID=0;
	String type;
	int amount;
	String paymentMode;
	
	public Bill() {
		// TODO Auto-generated constructor stub
		super();
		this.amount=0;
		this.type="";
		this.paymentMode="";
	}

	public Bill(String id, String name, String description, int amount, String type, String paymentMode) {
		super(id, name, description);
		// TODO Auto-generated constructor stub
		this.amount=amount;
		this.type=type;
		this.paymentMode=paymentMode;
	}
	
	void setAmount(int amount) {
		this.amount=amount;
	}
	void setType(String type) {
		this.type=type;
	}
	void setPaymentMode(String paymentMode) {
		this.paymentMode=paymentMode;
	}
	int getAmount() {
		return this.amount;
	}
	String getType() {
		return this.type;
	}
	String getPaymentMode() {
		return this.paymentMode;
	}
	@Override
    public String toString(){
        String s=new String();
        s="Id="+this.id+"\tName="+this.name+"\tDescription="+this.description+"\tPaymentMode="+this.paymentMode+"\tTotalAmount="+this.amount+"\tType="+this.type;
        return s;
    }

}
