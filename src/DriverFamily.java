import java.io.*;
import java.util.Scanner;
public class DriverFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to FAMILY MANAGEMENT!!!");
		System.out.println("What do you want to do?");
		System.out.println("1. Add customer, 2. Place an order, 3. View all customers, 4. View all orders");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		scan.nextLine();
		String id, custId, name, phoneNo, email, dateOfBirth, house, society, area, city, pincode;
		if(choice>=1 && choice<=4) {
			switch(choice) {
			case 1:
				Customer c=new Customer();
				System.out.println("Enter billing address details(house, society, area, city, pincode):");
				house=scan.nextLine();
				society=scan.nextLine();
				area=scan.nextLine();
				city=scan.nextLine();
				pincode=scan.nextLine();
				Customer.Address ba=c.new Address(house, society, area, city, pincode);
				System.out.println("Enter number of shipping addresses:");
				int size=scan.nextInt();
				scan.nextLine();
				Customer.Address[] sa=new Customer.Address[size];
				for(int i=0; i<size; i++) {
					System.out.println("Enter shipping address details:(house, society, area, city, pincode)");
					house=scan.nextLine();
					society=scan.nextLine();
					area=scan.nextLine();
					city=scan.nextLine();
					pincode=scan.nextLine();
					sa[i]=c.new Address(house, society, area, city, pincode);
				}
				System.out.println("Enter id, name, phone no, email, DOB:");
				id=scan.nextLine();
				name=scan.nextLine();
				phoneNo=scan.nextLine();
				email=scan.nextLine();
				dateOfBirth=scan.nextLine();
				c=new Customer(id, name, phoneNo, email, dateOfBirth, ba, sa);
				try {
					FileWriter fout=new FileWriter("customer.txt", true);
					fout.write(c.toString());
					fout.write("\r\n");
					fout.close();
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("Enter order id, your customer id:");
				id=scan.nextLine();
				custId=scan.nextLine();
				Order o=new Order(id, custId);
				o.addItem();
				try {
					FileWriter fout=new FileWriter("order.txt", true);
					fout.write(o.toString());
					fout.write("\r\n");
					fout.close();
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					BufferedReader buffer=new BufferedReader(new FileReader("customer.txt"));
					String str;
					while((str=buffer.readLine())!=null) {
						System.out.println(str);
					}
					buffer.close();
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try {
					BufferedReader buffer=new BufferedReader(new FileReader("order.txt"));
					String str;
					while((str=buffer.readLine())!=null) {
						System.out.println(str);
					}
					buffer.close();
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				}
				break;
			}
		}
		scan.close();
		
	}

}
