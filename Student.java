package example;

public class Student {	
	
	private int rollNumber;
	
	private String name;
	
	private String courseName;
	
	public void setRollNumber(int rollN) {
		this.rollNumber = rollN;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void takeExam(String examCode) {
		// business logic
	}
	
	public void attendClass(String className) {
		// business logic
	}
	
	public String toString() {
		StringBuilder studentRepresentation = new StringBuilder();
		return studentRepresentation.append("Roll Number :").append(this.rollNumber)
				.append("\nName: ").append(this.name)
				.append("\nCourse: ").append(this.courseName)
				.toString();
	}
	
}
