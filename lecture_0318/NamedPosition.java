package lecture_0318;

public class NamedPosition extends Position {
	// Position 클래스를 상속받는 NamedPosition 클래스를 작성
	// 	필드(private 선언)
	//		name	이름이 없는 경우 "No Name"
	private String name;
	// 	생성자
	//		기본 생성자
	NamedPosition() {
		this("No Name", 0, 0);
	}
	//		이름만 매개변수로 받는 생성자
	NamedPosition(String name) {
		this(name, 0, 0);
	}
	//		이름과 좌표를 매개변수로 받는 생성자
	NamedPosition(String name, int x, int y) {
		super(x, y);	// Position(int x, int y) 생성자를 호출
		setName(name);
	}
	//	Getter/Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (!validation(name)) name = "No Name";
		this.name = name;
	}
	private boolean validation(String str) {
		return str != null && str.length() > 0;
	}
	//	메서드
	//		이름과 좌표를 출력하는 메서드
	public void print() {
		System.out.print(name);
		super.print();
	}
	
}
