package studyonline.java_annotation_approach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component //Student student = new Student();
@Component("studentObj") // Student studentObj = new Student();
public class Student {

	@Autowired
	private Activities activities;

	void studentInfo() {
		System.out.println("This is the student info method!");
	}

	void playCricket() {
		activities.playCricket();
	}
}
