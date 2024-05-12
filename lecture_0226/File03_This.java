package lecture_0226;

class Simple02 {
	String name;	// 이름이 없는 경우, " - " 으로 저장
	int data;		// 데이터가 없는 경우, 0 
	
	// 클래스의 필드가 많아지면 여러 생성자가 작성되는 경우가 많다.
	// 이때, 동일한 필드를 받는 생성자가 생기게 되고
	// 이때, 초기화하기 위한 코드가 중복으로 발생한다.
	// → 다수의 생성자를 하나의 생성자를 통해 초기화가 되도록 한다.
	// → 이를 해결하기 위한 생성자에서 초기화 작업을 수행
	//	 = 모든 필드를 초기화를 초기화하는 생성자를 호출
	// → 생성자에서 다른 생성자를 호출할 때 사용되는 메서드
	//	 = this( ) 생성자 
	
	// this ( ) 생성자
	//	- 생성자 내에서 다른 생성자를 호출하기 위한 생성자
	//	- 생성자의 맨 첫 줄에 작성되어야한다.
	Simple02() { 
		// name = "Unknown";
		// data = 0;
		
		this(null, 0);
	}
	Simple02(String name) {
		// 필드에 초기화할 값을 검사하는 코드는
		// 필드가 선언된 클래스의 메서드에서 하는 것이 안전하다.
		
		// .isEmpty() : 빈 문자열인지 검사하는 메서드
		// if(argName == null || argName.isEmpty())
		//	argName = "Unknown";
		
		// name = argName;
		// data = 0;
			
		this(name, 0);
	}
	Simple02(String name, int data) {
		
		if(name == null || name.isEmpty())
			name = " - ";
				
		this.name = name;
		this.data = data;
	}
	
	
	// this 레퍼런스
	//	- 클래스 내에서 자신의 레퍼런스(주소)를 참조하는 변수
	//		= 즉, 자기 자신을 의미
	//	- 클래스 내에서 자신의 멤버에 접근할 때 사용
	// 		1. 필드의 이름과 매개변수(지역변수)의 이름이 같은 경우
	//		2. 다른 메서드(또는 다른 객체)에 자신의 레퍼런스를 넘길 때
	//		3. 메서드의 반환 값으로 자신의 레퍼런스로 반환해야하는 경우
	
	void setName(String name) {
		// 필드의 이름과 매개변수(또는 지역변수)의 이름이 같으면
		// 우선 순위는 매개변수가 더 높다.
		if(name == null || name.isEmpty())
			name = " - ";
		// name = name;
		// 	매개변수 name 의 값을 매개변수 name 에 저장
		
		this.name = name;
		// 매개변수 name 의 값을 자신의 필드 name 에 저장
	}
	
	
	
}


public class File03_This {
	public static void main(String[] args) {
		
		
		Simple02 s1 = new Simple02("");
		Simple02 s2 = new Simple02("Simple02", 2000);
		Simple02 s3 = new Simple02();
		
		System.out.println("s1 = " + s1.name);
		System.out.println("s2 = " + s2.name);
		System.out.println("s3 = " + s3.name);
		
		s1.setName("Simple01");
		System.out.println("s1 = " + s1.name);
		
		
		
		
	}
}
