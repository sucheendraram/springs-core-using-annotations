package studyonline.annotations.bean.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean(name = {"student", "studentObj", "s1", "stud", "studentBean"})
	public Student studentBean() {
		Student student = new Student();
		student.setStudentName("Sachin");
		student.setStudentId("1VI21CS012");
		student.setActivities(activitiesBean());
		return student;
	}
	
	@Bean
	public Activities activitiesBean() {
		return new Activities();
	}
	
}
