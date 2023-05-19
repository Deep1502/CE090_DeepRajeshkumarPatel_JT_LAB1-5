
public class Customer {

	String name;
	String id;
	String phoneNo;
	String email;
	String dateOfBirth;
	class Address{
		String house, society, area, pincode, city;
		public Address(String house, String society, String area, String city, String pincode){
			this.house=house;
			this.society=society;
			this.area=area;
			this.city=city;
			this.pincode=pincode;
		}
		public String toString() {
			return "House="+this.house+"\tSociety="+this.society+"\tArea="+this.area+"\tCity="+this.city+"\tPincode="+this.pincode;
		}
	}
	Address billing;
	Address shipping[];
	public Customer() {
		// TODO Auto-generated constructor stub
		
	}
	public Customer(String id, String name, String phoneNo, String email, String dateOfBirth, Address billing, Address shipping[]) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.phoneNo=phoneNo;
		this.email=email;
		this.dateOfBirth=dateOfBirth;
		this.billing=billing;
		this.shipping=shipping;
	}
	public String toString() {
		String s=new String();
		s="Id="+this.id+"\tName="+this.name+"\tPhoneNo="+this.phoneNo+"\tEmail="+this.email+"\tDOB="+this.dateOfBirth+"\t"+billing+"\t";
		for(int i=0; i<shipping.length; i++) {
			s+=shipping[i];
			s+="\t";
		}
		s+="\n";
		return s;
	}

}
