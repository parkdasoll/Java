package lecture_0226;



class Simple {
	String name;
	int data;
	
	// 생성자(Constructor)
	//	- 객체를 생성한 다음 생성된 객체의 필드를 초기화하기 위한 메서드
	//	- 객체를 생성하기 위해 사용된 new 연산자 다음에 객체의 생성자를 호출
	//	  객체를 생성할 때만 호출이 가능하다.
	//	- 클래스에 생성자가 없으면, 컴파일러가 컴파일 하면서 기본 생성자를 삽입
	//		기본 생성자 = 아무런 기능이 없는 생성자
	//	- 생성자의 형태
	//		생성자의 이름은 반드시 클래스의 이름과 동일
	//		반환 타입을 작성하지 않는다.(void 조차 작성하지 않는다.)
	
	// 기본 생성자
	Simple() {
		System.out.println("default constructor!");
		name = "No Name";
		data = -1;
	}
	
	// 이름만 초기화하는 생성자
	Simple(String argName) {
		System.out.println("Name parameter constructor!");
		name = argName;
		data = -1;
	}
	
	// 이름과 데이터를 초기화하는 생성자
	Simple(String argName, int argData) {
		System.out.println("Two parameters constructor!");
		name = argName;
		data = argData;
	}
	
	// 깊은 복사를 하기 위한 생성자
	// 매개변수에 전달된 객체의 필드로 초기화
	Simple(Simple s) {
		name = s.name;
		data = s.data;
	}
	
	
	
	
	// 메서드 오버로딩(Method Overloading)
	//	- 객체 지향의 특성 중 '다형성' 의 하나
	//	- 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것을 의미
	//	- 이름만 같을 뿐, 매개변수의 개수 또는 타입은 무조건 달라야한다.
	//	- 즉, 메서드의 이름이 같으면 전달되는 인자 값에 따라 호출되는
	//	  메서드가 결정된다.
	
	// → 메서드 오버로딩의 조건
	//		- 메서드의 이름이 동일
	//		- 매개변수의 개수 또는 타입이 달라야한다.
	//		  단, 메서드의 반환 타입과 매개변수의 식별자는 상관 없다.
	
	// 필드 data 에 일정 값만큼 더하기
	//	- int 형 데이터의 값 만큼 증가
	//	- Simple 객체의 data 값 만큼 증가
	
	// 필드 data 에 정수형 데이터를 더하기
	void add(int num) {
		data += num;
	}
	
	// 필드 data 에 다른 Simple 객체의 data 를 더하기
	void add(Simple s) {
		data += s.data;
	}
	
	
	
}


public class File02_Constructor {
	public static void main(String[] args) {
		
		// Simple 객체 생성
		Simple s1 = new Simple();
		// 생성된 객체에 필드의 값을 저장 
		s1.name ="Simple01";
		s1.data = 100;
		
		// s1.Simple(); 생성자를 별도로 호출할 수 없다.
		
		// Simple 객체 생성
		Simple s2 = new Simple();
		// new 연산자에 의해 만들어진 데이터들을 기본 값들로 초기화가 되면서 생성된다.
		// 	- 0, 0.0, false, null(아무것도 참조하고 있지 않다.)
		System.out.println("s2's name = " + s2.name);
		System.out.println("s2's data = " + s2.data);
		//-----------------------------------------------------------------
		System.out.println("s1's data = " + s1.data);
		s1.add(50);
		System.out.println("s1's data = " + s1.data);
		s1.add(s2.data);
		System.out.println("s1's data = " + s1.data);
		s1.add(s2);
		System.out.println("s1's data = " + s1.data);
		//-----------------------------------------------------------------
		Simple s3 = new Simple("Simple03");
		System.out.println("s3's name = " + s3.name);
		System.out.println("s3's data = " + s3.data);
		
		Simple s4 = new Simple("Simple04", 10000);
		System.out.println("s4's name = " + s4.name);
		System.out.println("s4's data = " + s4.data);
		//-----------------------------------------------------------------
		Simple s5 = new Simple("Simple05", 3000);
		Simple clone1 = s5;	// 얕은 복사 = 같은 객체를 공유
		
		Simple clone2 = new Simple(s5.name, s5.data);
		// s5 의 객체 자체를 복사를 하려면
		// 필드를 하나씩 넘기기 보다 객체의 레퍼런스를 넘기는 것이
		// 효율적이다.
		
		Simple clone3 = new Simple(s5);
		
		System.out.println("s5	= " + s5.name);
		System.out.println("clone1 	= " + clone1.name);
		System.out.println("clone2 	= " + clone2.name);
		System.out.println("clone3 	= " + clone3.name);
		
		s5.name = "Simple data 5";
		System.out.println("s5	= " + s5.name);
		System.out.println("clone1	= " + clone1.name);
		System.out.println("clone2	= " + clone2.name);
		System.out.println("clone3 	= " + clone3.name);
		
		
	}
}
















