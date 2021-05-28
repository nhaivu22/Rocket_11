package entity;

public class Worker extends Staff {
	private int rank;

	public Worker(String name, int age, Gender gender, String address,int rank) {
		super(name, age, gender, address);
		this.rank=rank;
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String toString() {
		return super.toString()+ "Worker [rank=" + rank + "]";
	}
	

}
