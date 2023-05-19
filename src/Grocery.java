
public class Grocery extends Family implements java.io.Serializable{

	static final long serialVersionUID=0;
	int quantity;
	int price;
	public Grocery() {
		// TODO Auto-generated constructor stub
		super();
		this.quantity=0;
		this.price=0;
	}

	public Grocery(String id, String name, String description, int quantity, int price) {
		super(id, name, description);
		// TODO Auto-generated constructor stub
		this.price=price;
		this.quantity=quantity;
	}
	void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	void setPrice(int price) {
		this.price=price;
	}
	int getQuantity() {
		return this.quantity;
	}
	int getPrice() {
		return this.price;
	}
	@Override
    public String toString(){
        String s=new String();
        s="Id="+this.id+"\tName="+this.name+"\tDescription="+this.description+"\tQuantity="+this.quantity+"\tPrice="+this.price;
        return s;
    }

}
