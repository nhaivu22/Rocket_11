package fontend;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Employee;
import entity.Engineer;
import entity.Staff;
import entity.Staff.Gender;
import entity.Worker;

public class Ex5_Inheritance {
	private ArrayList<Staff> staffList;
	private Scanner sc;

	public Ex5_Inheritance() {
		staffList = new ArrayList<Staff>();
		sc = new Scanner(System.in);
	}

	public void question2() {
		menu();
	}

	public void menu() {
		while (true) {
			System.out.println("||==============================================================||");
			System.out.println("||-------       Lựa chọn trức năng        ----------------------||");
			System.out.println("||--------    1.  Thêm mới cán bộ           --------------------||");
			System.out.println("||--------    2.  Tìm kiến theo họ tên      --------------------||");
			System.out.println("||--------    3.  Hiển thị danh sách        --------------------||");
			System.out.println("||--------    4.  Nhập và xóa cán bộ         -------------------||");
			System.out.println("||--------    5.  Thoát khỏi chương trình    -------------------||");
			System.out.println("||==============================================================||");
			int mmenuChoose = sc.nextInt();
			switch (mmenuChoose) {
			case 1:
				addStaff();
				break;
			case 2:
				findByName();
				break;
			case 3:
				printStaff();
				break;
			case 4:
				deleteName();
				break;
			default:
				System.out.println("Mời bạn chọn lại ");
				break;
			}
		}
	}

	private void deleteName() {
		// TODO Auto-generated method stub
		System.out.println("Nhập tên cần xóa thông tin: ");
		String delName = sc.next();
		staffList.removeIf(staff -> staff.getName().equals(delName));
		
	}

	private void printStaff() {
		// TODO Auto-generated method stub
		for (Staff staff : staffList) {
			System.out.println(staff);
		}
	}

	private void findByName() {
		// TODO Auto-generated method stub
		System.out.println("Nhập tên cán bộ muốn tìm kiếm ");
		String findName=sc.next();
		for (Staff staff : staffList) {
			if(staff.getName().equals(findName)) {
				System.out.println(staff);
			}
		}
	}

	private void addStaff() {
		// TODO Auto-generated method stub
		System.out.println("||==============================================================||");
		System.out.println("||-------       Lựa chọn trức năng        ----------------------||");
		System.out.println("||--------    1.  Thêm Employee           ----------------------||");
		System.out.println("||--------    2.  Thêm Worker             ----------------------||");
		System.out.println("||--------    3.  Thêm Engineer             --------------------||");
		System.out.println("||==============================================================||");
		int menuchoose1 = sc.nextInt();
		{
			switch (menuchoose1) {
			case 1:
						System.out.println("Nhập vào tên Employee  ");
						String nameEmoloyee=sc.next();
						System.out.println("Nhập vào tuổi Employee  ");
						int ageEmoloyee=sc.nextInt();
						System.out.println("Nhập giới tính Employee 1.Male  2.Female  3.Unknow ");
						int flagEmoloyee=sc.nextInt();
						Gender genderEmoloyee=null;
						switch (flagEmoloyee) {
								case 1: 
									genderEmoloyee=Gender.MALE;
									break;
								case 2:
									genderEmoloyee=Gender.FEMALE;
									break;
								case 3:
									genderEmoloyee=Gender.UNKNOWN;
									break;
								}
								System.out.println("Nhập địa chỉ  Employee ");
								String addEmoloyee=sc.next();
								System.out.println("Nhập nhiệm vụ Employee ");
								String taskEmoloyee=sc.next();
								Staff Emoloyee1=new Employee(nameEmoloyee, ageEmoloyee, genderEmoloyee, addEmoloyee, taskEmoloyee);
								staffList.add(Emoloyee1);
								break;
						
			case 2:
						System.out.println("Thêm tên của Worker");
						String nameString=sc.next();
						System.out.println("Nhập tuổi của Worker");
						int ageWorker=sc.nextInt();
						System.out.println("nhập giới tính của Worker 1.Male  2.Female  3.Unknow");
						int flagGender=sc.nextInt();
						Gender genderWorker=null;
						switch(flagGender) {
						case 1:
							genderWorker=Gender.MALE;
							break;
						case 2: 
							genderWorker=Gender.FEMALE;
							break;
						case 3:
							genderWorker=Gender.UNKNOWN;
							break;
						}
						System.out.println("nhập vào địa chỉWorker" );
						String addWorker=sc.next();
						System.out.println("nhập vào cấp bậc Worker");
						int rankWorker=sc.nextInt();
						Staff Worker1=new Worker(nameString, ageWorker, genderWorker, addWorker, rankWorker);
						staffList.add(Worker1);
						break;
			case 3:
				System.out.println("nhập vào tên Engineer");
				String nameEngineer=sc.next();
				System.out.println("nhập vào tuổi Engineer");
				int ageEngineer=sc.nextInt();
				System.out.println("nhập vào giới tính Engineer 1.Male  2.Female  3.Unknow");
				int flagEngineer=sc.nextInt();
				Gender genderEngineer=null;
				switch(flagEngineer) {
				case 1:
					genderEngineer= Gender.MALE;
					break;
				case 2:
					genderEngineer=Gender.FEMALE;
					break;
				case 3:
					genderEngineer=Gender.UNKNOWN;
					break;
				}
				System.out.println("Nhập vào địa chỉ Engineer ");
				String addEngineer=sc.next();
				System.out.println("nhập nhiệm vụ Engineer");
				String specializedEngineer=sc.next();
				Staff Engineer1=new Engineer(nameEngineer, ageEngineer, genderEngineer, addEngineer, specializedEngineer);
				staffList.add(Engineer1);
				
			default:
				break;
				
			}	
		}
	}
}
