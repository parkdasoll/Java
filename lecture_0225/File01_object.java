package lecture_0225;


// 객체를 만들기 위한 클래스
//	- 한 파일에 두 개 이상의 클래스를 작성하는 경우
//	  → 파일의 이름과 다른 클래스는 'public' 을 제외하고 선언 
//	- 클래스를 각 파일마다 작성하는 경우
//	  → Java 에서 권장하는 방식 

// 클래스 정의
class Simple {
	// Simple 클래스의 객체가 갖는 속성과 가능을 선언 및 정의
	
	// 객체의 속성들을 저장하기 위한 변수가 필요하며
	// 이를 필드 또는 멤버 변수라고 한다.
	String name;
	int data;
	
	// 객체가 수행할 기능들을 구현하기 위한 메서드
	
	// 자신의 필드를 출력하기 위한 기능
	void print() {
		System.out.println("name = " + name);
		System.out.println("data = " + data);
	}
	
}


// 객체를 만들기 위한 클래스가 아닌
// 프로그램을 실행하기 위한 클래스
public class File01_object {
	public static void main(String[] args) {
		// Simple 클래스의 객체를 생성 및 접근
		//	- 객체를 생성할 때는 new 연산자를 통해 생성해야한다.
		//		new 연산자 	: 데이터를 생성하기 위한 메모리를 동적 할당
		//				  	: 연산 결과 = 할당된 메모리의 주소
		//	- new 연산자에 의해 반환된 메모리 주소를  저장할 
		//	  참조 변수(Reference Variable)를 선언
		
		// Simple 객체 생성
		Simple simple1 = new Simple();
		// Simple Simple1;
		//	→ Simple 클래스 객체의 메모리 주소를 저장할 참조 변수
		
		System.out.println(simple1);
		//	lecture_0225.Simple@5e91993f
		// 	= 클래스타입@메모리주소
		
		// 객체의 멤버 접근
		//	- 객체의 주소를 저장하고 있는 참조 변수 뒤에
		//	  멤버 접근 연산자(.) 작성하여 
		//	  객체의 멤버에 접근할 수 있다.
		simple1.name = "Simple1";	// simple1 의 name
		simple1.data = 1000;		// simple1 의 data
		
		System.out.println("simple1.name = " + simple1.name);
		System.out.println("simple1.data = " + simple1.data);
		simple1.print();
		
		Simple simple2 = new Simple();
		simple2.name = "Simple2";
		simple2.data = 2000;
		simple2.print();
	}
}
























