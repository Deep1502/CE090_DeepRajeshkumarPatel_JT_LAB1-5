
public abstract class Family {
	
	String id, name, description;
	static int numberOfProducts;
	static {
		numberOfProducts=0;
	}
	static int getNumberOfProducts() {
		return numberOfProducts;
	}
	public Family(){
		id="";
		name="";
		description="";
		numberOfProducts++;
	}
	public Family(String id, String name, String description) {
		this.id=id;
		this.name=name;
		this.description=description;
		numberOfProducts++;
	}
	void setId(String id) {
		this.id=id;
	}
	void setName(String name) {
		this.name=name;
	}
	void setDescription(String description) {
		this.description=description;
	}
	String getId() {
		return this.id;
	}
	String getName() {
		return this.name;
	}
	String getDescription() {
		return this.description;
	}
	public String toString(){
        String s=new String();
        s="Id="+this.id+"\tName="+this.name+"\tDescription="+this.description;
        return s;
    }
	
}
