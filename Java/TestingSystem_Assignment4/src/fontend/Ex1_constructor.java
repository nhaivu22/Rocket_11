package fontend;



import java.time.LocalDate;

import entity.Account;
import entity.Answer;
import entity.Department;
import entity.Group;
import entity.Position;


public class Ex1_constructor {
	public static void main(String[] args) {
		
	}
	public  void Question1 (){
		Department department1 = new Department(0, "nhai");
		Department department2 = new Department();
		System.out.println(department2.toString());
		System.out.println(department1.toString());
	
		
	}
	public void Question2() {
		Account account1 = new Account();
		Account account2 = new Account(2, "nhai", "vunhai", "vuthinhai");
		Position position1 = new Position();
		Account account3 = new Account(3, "hong@", "tahong", "vuthihong",position1);

		System.out.println(account3.createDate);
		Position position2 = new Position();
		Account account4 = new Account(3, "vunhait", "thithanh", "tathithi",position2, LocalDate.of(2020, 07, 02));
	}
	public void Question3()	{
		Group group1=new Group();
		System.out.println(group1);
		
	}
}
