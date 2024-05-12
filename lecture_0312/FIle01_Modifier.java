package lecture_0312;

// static 제어자
//	- '클래스의', '공통적인' 의 의미
//	- 일반 멤버 변수같은 경우, 인스턴스(객체)가 생성된 다음 만들어지며
//	  각 인스턴스마다 다른 값을 유지한다.
//	- static 으로 선언된 멤버 변수는 모든 인스턴스가 같은 값을 갖는다.
//		→ static 으로 선언된 멤버 변수는 단 하나만 만들어지고
//		  모든 인스턴스가 공유하여 사용한다.

// static 멤버 변수
//	- 모든 인스턴스가 공용으로 사용하는 클래스 변수
//		= 인스턴스가 갖는 변수가 아닌 클래스 자체가 갖는 변수
//		= 클래스에 생성되는 변수
//	- 인스턴스를 생성하지 않고 사용이 가능
//		= 클래스를 통해서 static 멤버 변수에 접근이 가능
// 	- JVM이 클래스를 로드할 때 생성

// static 멤버 함수
//	- 인스턴스를 생성하지 않고 호출이 가능
//	- static 으로 선언된 메서드 내에서는 static 멤버만 접근이 가능
//	  즉, 일반 인스턴스 멤버는 접근할 수 없다.

// static 멤버의 특성
//	- 공간적 특성
//		: 클래스에 하나 생성
//		: 인스턴스(객체)에 생성되는 것이 아니다.
//	- 시간적 특성
//		: 클래스를 읽어들일 때 생성
//		: 아무런 참조 변수가 없어도 사라지지 않는다.
//		: 프로그램이 종료할 때 사라진다.
//	- 공유 특성
//		: 동일한 클래스의 모든 인스턴스들이 공유


// final 제어자
//	- 최종 형태로 유지하기 위한 제어자
//	- final 변수
//		: 변수의 값을 수정할 수 없도록 한다.	= 상수
//	- final 메서드
//		: 동일한 이름의 메서드로 재정이 되지 않도록 한다. 
//		: 메서드 오버라이딩을 할수 없는 메서드
//	- final 클래스
//		: 상속할 수 없는 클래스


public class FIle01_Modifier {
	public static void main(String[] args) {
		Simple s1 = new Simple();
		
		// 객체를 통해 각 멤버에 접근
		s1.defaultData = 100;
		s1.staticData = 200;
		
		System.out.println("s1.defaultData = " + s1.defaultData);
		System.out.println("s1.staticData = " + s1.staticData);
		s1.defaultPrint();
		s1.staticPrint();
		System.out.println("---------------------------------------------------");
		
		Simple s2 = new Simple();
		
		s2.defaultData = 300;
		s2.staticData = 400;
		
		System.out.println("s2.defaultData = " + s2.defaultData);
		System.out.println("s2.staticData = " + s2.staticData);
		s2.defaultPrint();
		s2.staticPrint();
		System.out.println("---------------------------------------------------");
		System.out.println("s1.defaultData = " + s1.defaultData);
		// → 인스턴스 멤버 변수 같은 경우 각 인스턴스마다 존재하기 때문에
		//	 다른 값을 유지한다.
		System.out.println("s1.staticData = " + s1.staticData);
		// → static 멤버 변수 같은 경우 클래스에 하나만 만들어지고 
		//	 모든 인스턴스들이 공유한다.
		System.out.println("---------------------------------------------------");
		// static 멤버는 공유의 특성을 활용하기 보다
		// 클래스가 갖는 멤버임을 활용하는 경우가 많다.
		// → 클래스를 통해서 접근
		// → 객체를 만들지 않고도 필드와 메서드를 사용하기 위해 사용
		System.out.println("Simple.staticData = " + Simple.staticData);
		Simple.staticPrint();
		
		System.out.println("---------------------------------------------------");
		// 활용 예시
		//	Math 클래스 : 수학 관련 라이브러리
		double result = Math.pow(5, 3);		// 제곱
		System.out.println("result = " + result);
		
		double result2 = Math.sqrt(124);	// 제곱근
		System.out.println("result2 = " + result2);
		
		int radius = 8;
		double area = radius * radius * Math.PI;
		System.out.println("area = " + area);
	} 
}

























