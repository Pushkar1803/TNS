package static_concept;

public class EMployee {
	
	private String name;
	private int id;
	
	static String companyName="TNS";

	public EMployee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "EMployee [name=" + name + ", id=" + id + "], company=" + companyName+"]";
	}
	

}
