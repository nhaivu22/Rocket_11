package frontend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ex5_inputfromconsole {
	public static void main(String[] args) {
		
		
//		----------Question 1: 
		
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Mời bạn nhập số thứ nhất");
//		int a=scanner.nextInt();
//		System.out.println("Mời bạn nhập số thứ hai");
//		int b=scanner.nextInt();
//		System.out.println("Mời bạn nhập số thứ ba");
//		int c=scanner.nextInt();
//		System.out.println("ba số dương bạn vừa nhập là:"+a+" "+b+" " +c);
//		scanner.close();
		
		
//	---------	Question 2 
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("moi bạn nhập số thực thứ nhất ");
//		double a=scanner.nextDouble();
//		System.out.print("moi bạn nhập số thực thứ hai ");
//		double b=scanner.nextDouble();
//		System.out.println("số bạn vừa nhập là : "+a+ "và "+b);
//		scanner.close();
//		
		
//	-----------	Question 3
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("Nhập Họ ");
//		String a=scanner.next();
//		System.out.print("Nhập tên ");
//		String b=scanner.next();
//		System.out.println("Họ và tên bạn vừa nhập là :"+a+" "+b);
//		
//		scanner.close();
		
//		Scanner scanner=new Scanner(System.in);
//		SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
//		try {
//			System.out.print("Nhap ngay thang nam sinh: ");
//			Date date=df.parse(scanner.nextLine());
//			System.out.println("Ngay thang nam sinh cua ban la: "+df.format(date));
//			
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
////	-----------	Question 6
//		  Scanner scanner =new Scanner(System.in);
//		   System.out.println("mời ban nhập thông tin của department: ");
//		   System.out.print(" id của department: ");
//		   int a=scanner.nextInt();
//		   System.out.print("Name của department: ");
//		   String b=scanner.next();
//		   System.out.println("Thông tin depatment bạn vừa nhập là : \n"+ "id: "+a+"\n"+"name: "+b);
//	
//		scanner.close();
		
		
////	-----------	Question 7
		
		
//		Scanner scanner =new Scanner(System.in);
//		System.out.println(" mời bạn nhập số chẵn");
//		int a=scanner.nextInt();
//		if(a%2==0) {
//			System.out.println(" số chẵn bạn vừa nhập là");
//		}else {
//			System.out.println("số bạn vừa nhập không phải là số chẵn");
//		}
		


		taoaccount();
	}
	 public static void taoaccount() {
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Mời bạn nhập vào thông tin của account:");
		System.out.print("Nhập id: ");
		int id=scanner.nextInt();
		System.out.print("nhập tên : ");
		String name =scanner.next();
		System.out.print("Nhập email: ");
		String email=scanner.next();
		System.out.print(" Thông tn bạn vừa nhập là: \n "+"id: "+id+"\n"+"tên: "+name+"\n"+"email: "+email);
		
	}
	
}
