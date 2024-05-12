package lecture_0318;

public class Student extends Person {
	//	학번		: 없는 경우 " - " 으로 설정
	//	학년		: 음수인 경우 0
	private String studentNumber;
	private int schoolYear;
	
	// 생성자
	public Student() {
		this(null, 0, null, 0);
	}
	
	public Student(String name, int age) {
		this(name, age, null, 0);
	}
	
	public Student(String name, int age, String studentNumber, int schoolYear) {
		super(name, age);
		setStudentNumber(studentNumber);
		setSchoolYear(schoolYear);
	}
	
	// Getter, Setter
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		if(studentNumber == null || studentNumber.isEmpty()) 
			studentNumber = " - ";
		this.studentNumber = studentNumber;
	}
	
	public int getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(int schoolYear) {
		if(schoolYear < 0) schoolYear = 0;
		this.schoolYear = schoolYear;
	}
	
	
}
