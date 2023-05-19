import java.util.*;
import java.time.*;
public class Order implements java.io.Serializable{

	static final long serialVersionUID=0;
	String id;
	LocalDate date;
	LocalTime time;
	String customerId;
	int totalAmount;
	ArrayList<Grocery> grocery=new ArrayList<Grocery>();
	ArrayList<Bill> bill=new ArrayList<Bill>();
	ArrayList<Insurance> insurance=new ArrayList<Insurance>();
	
	public Order(String id, String customerId) {
		// TODO Auto-generated constructor stub
		date=LocalDate.now();
		time=LocalTime.now();
		this.id=id;
		this.customerId=customerId;
		this.totalAmount=0;
	}
	void addItem() {
		//user inputs the items
		String ch="y";
		String i, n, d, t, p;
		int a, q;
		String c;
		Scanner in=new Scanner(System.in);
		while(ch.equals("y")) {
			//input
			System.out.println("Enter object type:(bill,insurance,grocery) ");
			c=in.nextLine();
			if(c.equals("bill")) {
				System.out.println("Enter id,name,desc,amount,type,paymentmode: ");
				i=in.nextLine();
				n=in.nextLine();
				d=in.nextLine();
				a=in.nextInt();
				in.nextLine();
				t=in.nextLine();
				p=in.nextLine();
				Bill b=new Bill(i,n,d,a,t,p);
				bill.add(b);	
				this.totalAmount+=a;
			}
			else if(c.equals("grocery")) {
				System.out.println("Enter id,name,desc,quantity,price: ");
				i=in.nextLine();
				n=in.nextLine();
				d=in.nextLine();
				q=in.nextInt();
				in.nextLine();
				a=in.nextInt();
				in.nextLine();
				Grocery g=new Grocery(i,n,d,q,a);
				grocery.add(g);
				this.totalAmount+=a*q;
			}
			else if(c.equals("insurance")) {
				System.out.println("Enter id,name,desc,amount,policyholder,entityinsured: ");
				i=in.nextLine();
				n=in.nextLine();
				d=in.nextLine();
				a=in.nextInt();
				in.nextLine();
				p=in.nextLine();
				t=in.nextLine();
				Insurance ins=new Insurance(i,n,d,a,p,t);
				insurance.add(ins);
				this.totalAmount+=a;
			}
			System.out.println("Enter more?(y/n)");
			ch=in.nextLine();
		}
		in.close();
	}
	public String toString() {
		String s=new String();
		s="OrderID="+this.id+"\tCustomerID="+this.customerId+"\tDate="+this.date+"\tTime="+this.time+"\tTotAmt="+this.totalAmount+"\n";
		return s;
	}

}
