import java.util.Date;
import java.util.Locale.Category;

import com.sun.jdi.Type;

public class Question {
		int id;
		String content;
		CategoryQuestion categoryquestion;
		TypeQuestion typequestion;
		Account creator;
		Date createDate;
		Exam [] exam;
}
