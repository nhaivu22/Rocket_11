package frontend;

import java.util.Scanner;

import entity.Account;
import entity.Position;
import entity.Position.PositionName;



public class ex6_method {
	public static void main(String[] args) {
//		soNguyenDuong();
//	}
//	public static void soNguyenDuong() {
//		int i;
//		System.out.println("số nguyên dương nhỏ hơn 10");
//		for (i=1;i<10;i++) {
//			System.out.print(i+" ");
//		}

		chucnang();
	}

	public static void chucnang() {
		Scanner scanner = new Scanner(System.in);
		int choose;
		while (true) {
			System.out.println("Chọn chức năng : 1. tạo Department : 2.tạo Account");
			choose = scanner.nextInt();
			if (choose == 1) {
				System.out.println("mời ban nhập thông tin của department: ");
				System.out.print(" id của department: ");
				int a = scanner.nextInt();
				System.out.print("Name của department: ");
				String b = scanner.next();
				System.out.println("Thông tin depatment bạn vừa nhập là : \n" + "id: " + a + "\n" + "name: " + b);
			} else if (choose == 2) {
				System.out.println(" Mời bạn nhập vào thông tin của account:");
				Account accounts=new Account();
				System.out.print("Nhập id: ");
				accounts.id=scanner.nextInt();
				System.out.print("Nhập email: ");
				accounts.email=scanner.next();
				System.out.print(" nhập username: ");
				accounts.userName=scanner.next();
				 System.out.print(" Nhạp fullname: ");
				 accounts.fullName=scanner.next();
				System.out.print("Nhập Position (tương ứng với 1: Dev, 2: Test , 3: Scr , 4: PM): ");
				int pEnum=scanner.nextInt();
				switch (pEnum) {
				case 1:
					Position ps2=new Position();
					ps2.positionName=PositionName.DEV;
					accounts.position=ps2;
			
					break;
				case 2:
					Position ps3=new Position();
					ps3.positionName=PositionName.TEST;
					accounts.position=ps3;
					break;
				case 3:
					Position ps4=new Position();
					ps4.positionName=PositionName.SCRCRUMMASTER;
					accounts.position=ps4;
					break;
				case 4:
					Position ps5=new Position();
					ps5.positionName=PositionName.PM;
					accounts.position=ps5;
					break;
				}
//				System.out.println(" thông account là : \n"+"id: "+accounts.id+"\n"+"email: "+accounts.email+"\n"+"username: "+accounts.userName+"\n"+"fullname: "+accounts.fullName+"\n"+"postino: "+accounts.position.positionName);
				
				
			} else {
				System.out.println("Nhập lại ");
			}
		}
	}

}
