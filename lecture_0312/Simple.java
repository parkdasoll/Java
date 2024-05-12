package lecture_0312;

public class Simple {
	// 인스턴스 변수
	int defaultData;
	
	// static 변수 / 클래스 변수
	static int staticData;
	
	// final 변수 = 상수
	//	- 변수 선언 단계에서 초기화를 해주거나
	//	  생성자에서 초기화를 해줘야한다.
	//	- 각 인스턴스마다 다른 상수 값을 가질 수 있다.
	final int FINAL_DATA;
	
	//	- 모든 인스턴스가 동일한 상수를 갖는다.
	final static int FINAL_DATA2 = 100;
	
	Simple() {
		FINAL_DATA = 200;
	}
	Simple(int data) {
		FINAL_DATA = data;
	}
	
	
	// 인스턴스 메서드
	//	- 인스턴스 멤버와 static 멤버 모두 사용이 가능
	void defaultPrint() {
		System.out.println("defaultData = " + defaultData);
		System.out.println("staticData = " + staticData);
	}
	
	// static 메서드
	//	- static 멤버만 사용이 가능
	static void staticPrint() {
		// System.out.println("defaultData = " + defaultData);
		//	- 인스턴스 멤버는 객체를 생성한 다음 접근이 가능하기 때문에
		//	  객체 생성 전에 사용 가능한 static 메서드에서는 접근을 할 수 없다.
		
		System.out.println("staticData = " + staticData);
	}
	
}
