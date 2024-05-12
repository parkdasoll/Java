package lecture_0311;


// 간단한 클래스
public class Simple {
	// 필드(멤버 변수)
	String name;	// 이름이 없는 경우 "Unknown" 으로 설정
	int data;		// 0
	
	//------------------------------------------------
	// 각 접근 제어자로 선언된 필드
	public int publicData;
	protected int protectedData;
	int defaultData;
	private int privateData;
	
	// 멤버 변수 privateData 를 외부에서 다룰 수 있도록 메서드를 정의
	public int getPrivateData() { return privateData; }
	public void setPrivateData(int data) { privateData = data; }
	
	
	//------------------------------------------------
	
	// 객체를 생성할 때 필드를 초기화하기 위한 생성자(Constructor)
	// 기본 생성자
	Simple() {
		this(null, 0);
	}
	// 이름만 초기화하는 생성자
	Simple(String name) {
		this(name, 0);
	}
	// 데이터만 초기화하는 생성자
	Simple(int data) {
		this(null, data);
	}
	// 이름과 데이터를 초기화하는 생성자
	Simple(String name, int data) {
		if(name == null || name.isEmpty())
			name = "Unknown";
		
		// 멤버 변수의 이름과 매개변수의 이름이 같으면
		// 매개변수가 우선 순위가 높기 때문에 멤버 변수에 접근이 안된다.
		// 멤버 변수에 접근하기 위해 this 레퍼런스를 이용해야한다.
		//	this = 자기 자신
		this.name = name;
		this.data = data;
	}
	
	// 이름과 데이터를 출력하는 메서드
	void print() {
		System.out.println(name + "(" + data + ")");
	}
	
}
