package lecture_0318;

public class Teacher extends Person {
	// 직원 번호	: 없는 경우 " - "
	// 담당 과목	: 없는 경우 " - "
	private String employeeNumber;
	private String subject;
	
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	
	// 생성자
	public Teacher() {
		this(null, 0, null, null);
	}
	public Teacher(String name, int age) {
		this(name, age, null, null);
	}
	public Teacher(String name, int age, String employeeNumber, String subject) {
		super(name, age);
		setEmployeeNumber(employeeNumber);
		setSubject(subject);
	}
	
	
	// Getter, Setter
	public void setEmployeeNumber(String employeeNumber) {
		if(employeeNumber == null || employeeNumber.isEmpty())
			employeeNumber = " - ";
		this.employeeNumber = employeeNumber;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		if(subject == null || subject.isEmpty()) subject = " - ";
		this.subject = subject;
	}
}
