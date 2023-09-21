package studyonline.xmlapproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s1 = context.getBean("student", Student.class);
		s1.studentInfo();
	}
}
