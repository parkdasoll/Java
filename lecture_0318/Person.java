package lecture_0318;

public class Person {
	//		이름 	: 이름이 없는 경우 "Unknown" 으로 설정
	//		나이 	: 음수인 경우 0 으로 설정
	private String name;
	private int age;
	
	// 생성자
	public Person() {
		this(null, 0);
	}
	
	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	// Getter,Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name == null || name.isEmpty()) name = "Unknown";
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 0) age = 0;
		this.age = age;
	}
	
}
