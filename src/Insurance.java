
public class Insurance extends Family implements java.io.Serializable{

	static final long serialVersionUID=0;
	int amount;
	String policyHolder;
	String entityInsured;
	
	public Insurance() {
		// TODO Auto-generated constructor stub
		super();
		this.amount=0;
		this.policyHolder="";
		this.entityInsured="";
	}

	public Insurance(String id, String name, String description, int amount, String policyHolder, String entityInsured) {
		super(id, name, description);
		// TODO Auto-generated constructor stub
		this.amount=amount;
		this.policyHolder=policyHolder;
		this.entityInsured=entityInsured;
	}
	
	void setAmount(int amount) {
		this.amount=amount;
	}
	void setPolicyHolder(String policyHolder) {
		this.policyHolder=policyHolder;
	}
	void setEntityInsured(String entityInsured) {
		this.entityInsured=entityInsured;
	}
	int getAmount() {
		return this.amount;
	}
	String getEntityInsured() {
		return this.entityInsured;
	}
	String getPolicyHolder() {
		return this.policyHolder;
	}
	@Override
    public String toString(){
        String s=new String();
        s="Id="+this.id+"\tName="+this.name+"\tDescription="+this.description+"\tPolicyHolder="+this.policyHolder+"\tEntityInsured="+this.entityInsured+"\tAmount="+this.amount;
        return s;
    }

}
