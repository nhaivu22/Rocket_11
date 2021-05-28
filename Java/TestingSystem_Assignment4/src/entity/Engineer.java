package entity;

public class Engineer extends Staff {
	private String specialized;

	public Engineer(String name, int age, Gender gender, String address,String specialized) {
		super(name, age, gender, address);
		this.specialized=specialized;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+"Engineer [specialized=" + specialized + "]";
	}
	

}
