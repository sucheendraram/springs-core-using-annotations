package studyonline.java_annotation_approach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student = context.getBean("studentObj", Student.class);
		student.studentInfo();
		student.playCricket();
	}
}
