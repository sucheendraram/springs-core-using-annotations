package studyonline.annotations.bean.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentApplication {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student = context.getBean("studentBean",Student.class);
		student.StudentInfo();
	}
}
