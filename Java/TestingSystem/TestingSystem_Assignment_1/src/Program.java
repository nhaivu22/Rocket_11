import java.util.Date;

public class Program {
public static void main(String []args) {
	
	//        Department          //
	
	Department department1=new Department();
	department1.id=1;
	department1.name="Sale";
	
	Department department2=new Department();
	department2.id=2;
	department2.name="Marketting";
	
	Department department3=new Department();
	department3.id=3;
	department3.name="Nhân sự";
	
	Department department4=new Department();
	department4.id=4;
	department4.name="Kế Toán";
	
	Department department5=new Department();
	department5.id=5;
	department5.name="Bảo vệ";
	 
	
	// 	   Position        /////////
	
	Position position1= new Position();
	position1.id=1;
	position1.gender=Gender.DEV;
	
	Position position2= new Position();
	position2.id=2;
	position2.gender=Gender.MASTER;
	
	Position position3= new Position();
	position3.id=3;
	position3.gender=Gender.SCRUM;
	
	Position position4= new Position();
	position4.id=4;
	position4.gender=Gender.TEST;
	
	Position position5= new Position();
	position5.id=5;
	position5.gender=Gender.DEV;
	
	//			Group			//
		Group group1=new Group();
		group1.id=1;
		group1.name="nhóm 1";
		group1.createDate= new Date("2019-06-12");
		
		Group group2=new Group();
		group2.id=2;
		group2.name="nhóm 2";
		group2.createDate= new Date("2020-02-15");
		
		Group group3=new Group();
		group3.id=3;
		group3.name="nhóm 3";
		group3.createDate= new Date("2020-05-06");
		
		
	
	//			Account			//
		
	Account account1= new Account();
	account1.id=1;
	account1.email="nhaivu22@gmail.com";
	account1.userName="Vu Nhai";
	account1.fullName="Vũ Thị Nhài";
	account1.department=department1;
	account1.position=position1;
	account1.createDate= new Date ("2019-02-12") ;
	Group[]groupOfAccount1= {group1,group2};
	account1.groups=groupOfAccount1;

	
	
	Account account2= new Account();
	account2.id=2;
	account2.email="honghong@gmail.com";
	account2.userName="Thị Hồng";
	account2.fullName="Tạ Thị Hồng";
	account2.department=department2;
	account2.position=position2;
	account2.createDate= new Date ("2019-03-12") ;
	Group[]groupOfAccount2= {group2,group3};
	account2.groups=groupOfAccount2;
	
	
	
	Account account3= new Account();
	account3.id=3;
	account3.email="hue@gmail.com";
	account3.userName="Thanh Huệ";
	account3.fullName="Nguyễn Thanh Huệ";
	account3.department=department3;
	account3.position=position3;
	account3.createDate= new Date ("2020-08-13") ;
	Group[]groupOfAccount3= {group1,group3};
	account3.groups=groupOfAccount3;
	
	
	
	Account account4= new Account();
	account4.id=4;
	account4.email="kim@gmail.com";
	account4.userName="Thúy Kim";
	account4.fullName="Nguyễn Thúy Kim";
	account4.department=department4;
	account4.position=position4;
	account4.createDate= new Date ("2021-03-19") ;
	Group[]groupOfAccount4= {group1,group2,group3};
	account4.groups=groupOfAccount4;
	
	
	Account account5= new Account();
	account5.id=5;
	account5.email="tom@gmail.com";
	account5.userName="Hồng Tôn";
	account5.fullName="Vũ Hồng Tôn";
	account5.department=department4;
	account5.position=position2;
	account5.createDate= new Date ("2021-09-12") ;
	Group[]groupOfAccount5= {group2,group3};
	account5.groups=groupOfAccount5;

	 //			TypeQuestion			//
	
	TypeQuestion typequestion1= new TypeQuestion();
	typequestion1.id=1;
	typequestion1.tquestion=TQuestion.ESSAY;
	
	TypeQuestion typequestion2= new TypeQuestion();
	typequestion2.id=2;
	typequestion2.tquestion=TQuestion.MULTIPLECHOICE;
	
	TypeQuestion typequestion3= new TypeQuestion();
	typequestion3.id=3;
	typequestion3.tquestion=TQuestion.MULTIPLECHOICE;
	
	TypeQuestion typequestion4= new TypeQuestion();
	typequestion4.id=4;
	typequestion4.tquestion=TQuestion.ESSAY;
	
	TypeQuestion typequestion5= new TypeQuestion();
	typequestion5.id=5;
	typequestion5.tquestion=TQuestion.MULTIPLECHOICE;
	
	
	//			CategoryQuestion			//
	
	CategoryQuestion categoryquestion1= new CategoryQuestion();
	categoryquestion1.id=1;
	categoryquestion1.cquestion=CQuestion.JAV;
	
	CategoryQuestion categoryquestion2= new CategoryQuestion();
	categoryquestion2.id=2;
	categoryquestion2.cquestion=CQuestion.NET;
	
	CategoryQuestion categoryquestion3= new CategoryQuestion();
	categoryquestion3.id=3;
	categoryquestion3.cquestion=CQuestion.POSTMAN;
	
	CategoryQuestion categoryquestion4= new CategoryQuestion();
	categoryquestion4.id=4;
	categoryquestion4.cquestion=CQuestion.RUBY;
	
	CategoryQuestion categoryquestion5= new CategoryQuestion();
	categoryquestion5.id=5;
	categoryquestion5.cquestion=CQuestion.SQL;
	
	CategoryQuestion categoryquestion6= new CategoryQuestion();
	categoryquestion6.id=6;
	categoryquestion6.cquestion=CQuestion.RUBY;
	
	
	
	
	//Question
	
	Question question1= new Question();
	question1.id=1;
	question1.content="Câu hỏi Về Java";
	question1.categoryquestion=categoryquestion1;
	question1.typequestion=typequestion1;
	question1.creator=account1;
	question1.createDate=new Date("2020-03-18");
	
	
	Question question2= new Question();
	question2.id=2;
	question2.content="Câu hỏi Về C";
	question2.categoryquestion=categoryquestion2;
	question2.typequestion=typequestion2;
	question2.creator=account2;
	question2.createDate=new Date("2020-08-24");
	
	
	Question question3= new Question();
	question3.id=3;
	question3.content="Câu hỏi Về Java";
	question3.categoryquestion=categoryquestion3;
	question3.typequestion=typequestion3;
	question3.creator=account3;
	question3.createDate=new Date("2020-09-07");	
	
	
	
	Question question4= new Question();
	question4.id=4;
	question4.content="Câu hỏi Về PHP";
	question4.categoryquestion=categoryquestion4;
	question4.typequestion=typequestion4;
	question4.creator=account4;
	question4.createDate=new Date("2021-02-02");
	
	
	Question question5= new Question();
	question5.id=5;
	question5.content="Câu hỏi Về Py";
	question5.categoryquestion=categoryquestion5;
	question5.typequestion=typequestion5;
	question5.creator=account5;
	question5.createDate=new Date("2019-07-12");
	
	
	
	//	 Exam			//	
		
	Exam exam1= new Exam();
	exam1.id=1;
	exam1.code=125;
	exam1.title="Đề Thi C";
	exam1.categoryquestion =categoryquestion1;
	exam1.duration=60;
	exam1.createDate=new Date("2021-08-01");
	exam1.creatorID= account1;
	Question[]questionOfExam1= {question1,question2};
	exam1.questions=questionOfExam1;
	
	Exam exam2= new Exam();
	exam2.id=2;
	exam2.code=78;
	exam2.title="Đề thi PHP";
	exam2.categoryquestion =categoryquestion2;
	exam2.duration=30;
	exam2.createDate=new Date("2021-06-17");
	exam2.creatorID= account2;
	Question[]questionOfExam2= {question1,question2,question3};
	exam1.questions=questionOfExam2;

	Exam exam3= new Exam();
	exam3.id=3;
	exam3.code=78;
	exam3.title="Đề thi Ruby";
	exam3.categoryquestion =categoryquestion2;
	exam3.duration=30;
	exam3.createDate=new Date("2021-06-17");
	exam3.creatorID= account3;
	Question[]questionOfExam3= {question2,question3};
	exam1.questions=questionOfExam3;


	Exam exam4= new Exam();
	exam4.id=4;
	exam4.code=98;
	exam4.title="Đề thi Python";
	exam4.categoryquestion =categoryquestion4;
	exam4.duration=30;
	exam4.createDate=new Date("2020-12-09");
	exam4.creatorID= account4;
	Question[]questionOfExam4= {question2,question3,question4};
	exam1.questions=questionOfExam4;
	
	Exam exam5= new Exam();
	exam5.id=5;
	exam5.code=112;
	exam5.title="Đề thi Python";
	exam5.categoryquestion =categoryquestion4;
	exam5.duration=30;
	exam5.createDate=new Date("2021-04-07");
	exam5.creatorID= account5;
	Question[]questionOfExam5= {question1,question2,question3,question4};
	exam5.questions=questionOfExam5;

	
	
	
	
	
	// 				Answer		//
	
	Answer answer1=new 	Answer();
	answer1.id=1;
	answer1.content="Trả lời số 1";
	answer1.question=question1;
	answer1.isCorrect=true;
	
	Answer answer2=new 	Answer();
	answer2.id=1;
	answer2.content="Trả lời số 2";
	answer2.question=question2;
	answer2.isCorrect=true;
	
	Answer answer3=new 	Answer();
	answer3.id=3;
	answer3.content="Trả lời số 3";
	answer3.question=question3;
	answer3.isCorrect=false;
	
	Answer answer4=new 	Answer();
	answer4.id=4;
	answer4.content="Trả lời số 4";
	answer4.question=question4;
	answer4.isCorrect=false;
	
	Answer answer5=new 	Answer();
	answer5.id=5;
	answer5.content="Trả lời số 5";
	answer5.question=question5;
	answer5.isCorrect=true;
	

	
System.out.println(answer1.content);
	
	
	
	
	
	
	
	}
}