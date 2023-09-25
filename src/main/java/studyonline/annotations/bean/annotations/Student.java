package studyonline.annotations.bean.annotations;

public class Student {
	private String studentName;
	private String studentId;
	private Activities activities;
	
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public void setActivities(Activities activities) {
		this.activities = activities;
	}

	public void StudentInfo() {
		System.out.println("The name of student is "+studentName);
		System.out.println("The USN number of student is "+studentId);
		System.out.println("The student hobbies are listed below");
		activities.playCricket();
		activities.dispHobbies();
	}
	
}
