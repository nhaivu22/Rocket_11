package frontend;

import java.time.LocalDate;
import java.util.Iterator;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.Position;
import entity.Position.PositionName;

public class ex1_flowControl {
	public static void main(String[] args) {
		// Department//

		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketing ";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Kế Toán";

		Department department4 = new Department();
		department4.id = 4;
		department4.name = "Nhân Sự";

		Department department5 = new Department();
		department5.id = 5;
		department5.name = "Bảo Vệ";

//	    Position//

		Position position1 = new Position();
		position1.id = 1;
		position1.positionName = PositionName.DEV;

		Position position2 = new Position();
		position2.id = 2;
		position2.positionName = PositionName.PM;

		Position position3 = new Position();
		position3.id = 3;
		position3.positionName = PositionName.TEST;

		Position position4 = new Position();
		position4.id = 4;
		position4.positionName = PositionName.SCRCRUMMASTER;

		Position position5 = new Position();
		position5.id = 5;
		position5.positionName = PositionName.DEV;

//		Group			//

		Group group1 = new Group();
		group1.id = 1;
		group1.name = "nhóm 1";
		group1.createDate = LocalDate.of(2021, 05, 05);

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "nhóm 2";
		group2.createDate = LocalDate.of(2020, 07, 1);

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "nhóm 3";
		group3.createDate = LocalDate.of(2019, 04, 03);

		// Account //

		Account account1 = new Account();
		account1.id = 1;
		account1.email = "nhai1@gmail.com";
		account1.position = position1;
		account1.department = department1;
		account1.userName = "Nhai";
		account1.fullName = "Vũ Thị Nhài";
		account1.groups = new Group[] { group1, group2 };
		account1.createDate = LocalDate.now();

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "honghoa@gmail.com";
		account2.position = position2;
		account2.department = department2;
		account2.userName = "Hồng";
		account2.fullName = "Vũ Thị Hồng";
		account2.groups = new Group[] { group2, group3 };
		account2.createDate = LocalDate.now();
		
		Account account3= new Account();
		account3.id = 3;
		account3.email = "hip@gmail.com";
		account3.position = position2;
		account3.department = department3;
		account3.userName = "hip";
		account3.fullName = "Vũ hip";
		account3.groups = new Group[] { group1,group2, group3 };
		account3.createDate = LocalDate.now();
		
		Account account4= new Account();
		account4.id = 4;
		account4.email = "hu@gmail.com";
		account4.position = position4;
		account4.department = department4;
		account4.userName = "hip";
		account4.fullName = "Vũ hu";
		account4.groups = new Group[] { group1,group2 };
		account4.createDate = LocalDate.now();
		
		

//	-----------	IF--------------

//	----	Question1--------//

//		if(account2.department==null) {
//			System.out.println("Nhân viên này chưa có phòng ban");
//		}else {
//			System.out.println("Phòng ban của nhân viên này là: "+account2.department.name);
//		}

//		----	Question2--------//		

//		if(account2.groups.length==0) {
//			System.out.println("Nhân viên này chưa có group");
//		}else if(account2.groups.length==1||account2.groups.length==2) {
//			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
//		}else if(account2.groups.length==3) {
//			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
//		}else {
//			  System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
//		}

//		----	Question3--------//	

//		System.out.println(account2.department==null ?"Nhân viên chưa có phòng ban" :"Phòng ban của nhân viên là: "+account2.department.name);
		
//		----	Question4--------//	
		
//		System.out.println(account1.position.positionName==PositionName.DEV?"Đây là Developer":"Người này không phải là Developer" );
		
		
//	-----------	SWITCH CASE-----------
		
		
//	-------	Question 5-------
		
		
//		group1.accounts=new Account[] {account1,account2};
//		
//		switch (group1.accounts.length) {
//		case 1:
//			System.out.println("Nhóm có một thành viên");
//			break;
//		case 2:
//			System.out.println("Nhóm có hai thành viên");
//			break;
//
//		default:
//			System.out.println("Nhóm có ba thành viên");
//
//		}
		
		
//		-------	Question 6-------
		
		
//		switch (account2.groups.length) {
//		case 0:
//			System.out.println("Nhân viên này chưa có group");
//			break;
//		case 1:
//			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
//			break;
//		case 2:
//			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
//			break;
//		case 3:
//			System.out.println( "Nhân viên này là người quan trọng, tham gia nhiều group");
//			break;
//		default:
//			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		
		
		
//		
//		}
		
		
//		-------	Question 7-------
		
		
//	switch (account1.position.positionName) {
//	case DEV:
//		System.out.println("Đây là Developer");
//		break;
//
//	default:
//		System.out.println("Người này không phải là Developer");
//	}
//		
//		-----FOREACH-----
		
//		------Question 8: ------
		
//		Account[] accounts= {account1,account2};
//		 for (Account account : accounts) {
//			
//			 System.out.println("email của phòng ban : "+account.email);
//			 System.out.println(account.fullName);
//			 System.out.println(account.userName);
//			 System.out.println(account.department.name);
//		}
		
		
//		------Question 9: ------
		
		
//		Department[]departments= {department1,department2,department3,department4,department5};
//		for (Department department : departments) {
//			System.out.println("id của phòng ban : "+department.id);
//			System.out.println("name của phòng ban  : "+department.name);
//
//		}
		
//	-------------	FOR-------------------//--
		
		
//		--------Question 10
		
		
		
//		Account[] accounts= {account1,account2};
//		
//		for (int i = 0; i < accounts.length; i++) {
//			System.out.println("thông tin của account thứ "+(i+1));
//			System.out.println("ID: " +accounts[i].id);
//			System.out.println("Email: "+accounts[i].email);
//			System.out.println("fullName: "+accounts[i].fullName);
//			System.out.println("useName: "+accounts[i].userName+"\n");
//		}
		
		
//		-----------Question 11
		
		
//		 Department[] departments= {department1,department2,department3,department4,department5};
//		for (int i = 0; i < departments.length; i++) {
//			System.out.println("Thông tin của department thứ "+(i+1));
//			System.out.println("ID: "+departments[i].id);
//			System.out.println("Name: "+departments[i].id+"\n");
//
//			
//		}
		
//		--------Question 12
		
		
//		Department[] departments= {department1,department2,department3,department4,department5};
//		int i=departments.length;
//		for ( i = 0; i < 2; i++) {
//			System.out.println("Thông tin của department thứ "+(i+1));
//			System.out.println("ID: "+departments[i].id);
//			System.out.println("Name: "+departments[i].id+"\n");
//			
//		}
		
//		Account[] accounts= {account1,account2,account3};
//		int i=accounts.length;
//		for ( i = 0; i < 4; i++) {
//			if(i==2) {
//				return;
//			}
//			System.out.println("thông tin của account thứ "+(i+1));
//			System.out.println("ID: " +accounts[i].id);
//			System.out.println("Email: "+accounts[i].email);
//			System.out.println("fullName: "+accounts[i].fullName);
//			System.out.println("useName: "+accounts[i].userName+"\n");
//		
//			
//		}
		
//	-----------	Question 14
		
//		Account[] accounts= {account1,account2,account3,account4};
//		int i=0;
//		 for ( i = 0; i < accounts.length; i++) {
//			 if(accounts[i].id<4) {
//				 System.out
//					.println("Thông tin account thứ " + (i + 1) + " là :");
//			System.out.println("Email: " + accounts[i].email);
//			System.out.println("Fullname: " + accounts[i].fullName);
//			System.out
//					.println("Department: " + accounts[i].department.name);
//		}
//		 }
			
		
		
		
		
//		--------Question 15
		
//		for (int i = 0; i <=20;i= i+2) {
//			System.out.println(i);
//			
//		}

		
//	--------------	WHILE---------

//-------		Question 16-----Question 10:
		
//		Account[] accs= {account1, account1};
//		int i=0;
//		 while (i<=accs.length) {
//			 System.out.println("thông tin của account thứ "+(i+1));
//				System.out.println("ID: " +accs[i].id);
//				System.out.println("Email: "+accs[i].email);
//				System.out.println("fullName: "+accs[i].fullName);
//				System.out.println("useName: "+accs[i].userName+"\n");
//				i++;		
//		}
		
		
		//-------		Question 16-----Question 11:
		
//		Department[] dep= {department1,department2,department3,department4};
//		int i=0;
//		while (i<dep.length) {
//			System.out.println("Thông tin của department thứ "+(i+1));
//			System.out.println("ID: "+dep[i].id);
//			System.out.println("Name: "+dep[i].id+"\n");
//			i++;
//			
//		}
		
		
		//-------		Question 16-----Question 12:
//		Department[] dep= {department1,department2,department3,department4};
//		int i=0;
//		while (i<2) {
//			System.out.println("Thông tin của department thứ "+(i+1));
//			System.out.println("ID: "+dep[i].id);
//			System.out.println("Name: "+dep[i].id+"\n");
//			i++;
//			
//		}
		
		//-------		Question 16-----Question 13
		
		
//		Account[]accounts= {account1,account2,account3};
//		int i=0;
//		while (i<=accounts.length) {
//			if(i==1) {
//				i++
//				continue;
//			}
//			System.out.println("thông tin của account thứ "+(i+1));
//			System.out.println("ID: " +accounts[i].id);
//			System.out.println("Email: "+accounts[i].email);
//			System.out.println("fullName: "+accounts[i].fullName);
//			System.out.println("useName: "+accounts[i].userName+"\n");
//			i++;
//			
//		}
		
		
		
		//-------		Question 16-----Question 14
		
//		Account[] accounts= {account1,account2,account3,account4};
//		int i=0;
//		while (i<accounts.length) {
//			if(accounts[i].id >=4) {
//				i++;
//				continue;
//				
//			}
//			System.out.println("Thông tin account thứ " + (i + 1) + " là :");
//			System.out.println("Email: " + accounts[i].email);
//			System.out.println("Fullname: " + accounts[i].fullName);
//			System.out.println("Department: " + accounts[i].department.name);
//			i++;
			
//		}
		//-------		Question 16-----Question 15
		
//		int x=2;
//		while (x<=20) {
//			System.out.println(x);
//			x=x+2;
//			
//		}
//		
	
		
//	--------------	DO-WHILE--------------
		
		
//		-------		Question 17-----Question 10
		
		
//		Account[] accs= {account1, account1};
//		int i=0;
//	do {
//		System.out.println("thông tin của account thứ "+(i+1));
//		System.out.println("ID: " +accs[i].id);
//		System.out.println("Email: "+accs[i].email);
//		System.out.println("fullName: "+accs[i].fullName);
//		
//	} while (i<accs.length);
		
		
		
//		-------		Question 17-----Question 11
		
//		Department[] departments= {department1,department2,department3};
//		int i=0;
//		do {
//			System.out.println("Thông tin của department thứ "+(i+1));
//			System.out.println("ID: "+departments[i].id);
//			System.out.println("Name: "+departments[i].id+"\n");
//			
//		} while (i<departments.length);
//		
		
		
	}

}

