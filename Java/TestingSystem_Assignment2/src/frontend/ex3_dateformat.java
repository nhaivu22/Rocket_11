package frontend;

import java.time.LocalDate;

import entity.Exam;
import entity.Exam.Duration;

public class ex3_dateformat {
	public static void main(String[] args) {
		Exam exam1=new  Exam();
		exam1.id=1;
		exam1.code="AB4568";
		exam1.title="Bài thi số 1";
//		exam1.categoryQuestion=categoryQuestion1;
		exam1.duration=Duration.MINUTE_30;
//		exam1.creator=account1;
		exam1.createDate=LocalDate.now();
//		exam1.questions = new Question[] { question1, question2 };
		
		
		Exam exam2=new  Exam();
		exam2.id=2;
		exam2.code="AA89";
		exam2.title="Bài thi số 2";
//		exam2.categoryQuestion=categoryQuestion2;
		exam2.duration=Duration.MINUTE_60;
//		exam2.creator=account2;
		exam2.createDate=LocalDate.now();
//		exam2.questions = new Question[] { question1, question2, question3};
		
		Exam exam3=new  Exam();
		exam3.id=3;
		exam3.code="UY94";
		exam3.title="Bài thi số 3";
//		exam3.categoryQuestion=categoryQuestion3;
		exam3.duration=Duration.MINUTE_180;
//		exam3.creator=account2;
		exam3.createDate=LocalDate.now();
//		exam3.questions = new Question[] { question2, question3};
		
		
		Exam exam4=new  Exam();
		exam4.id=4;
		exam4.code="TRF";
		exam4.title="Bài thi số 4";
//		exam4.categoryQuestion=categoryQuestion3;
		exam4.duration=Duration.MINUTE_120;
//		exam4.creator=account4;
		exam4.createDate=LocalDate.now();
//		exam4.questions = new Question[] { question2, question3,question4};
		
		
		Exam exam5=new  Exam();
		exam5.id=5;
		exam5.code="VGKTG";
		exam5.title="Bài thi số 5";
//		exam5.categoryQuestion=categoryQuestion3;
		exam5.duration=Duration.MINUTE_120;
//		exam5.creator=account4;
		exam5.createDate=LocalDate.now();
//		exam5.questions = new Question[] { question2, question3,question4};
		
//		System.out.println(exam1.createDate);
//		Locale local=new Locale("vi","VN");
//		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.DEFAULT,local);
//		String localDate=dateFormat.format(exam1.createDate);
//		System.out.println(localDate);
		
//		System.out.println(exam1.createDate);
		
		
	}
	

}
