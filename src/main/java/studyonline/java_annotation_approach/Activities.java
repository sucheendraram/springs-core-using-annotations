package studyonline.java_annotation_approach;

import org.springframework.stereotype.Component;

@Component("act") //Activities act = new Activities();
public class Activities {
	
	Activities(){
		System.out.println("Activities object is created");
	}
	void playCricket() {
		System.out.println("Playing cricket");
	}
}
