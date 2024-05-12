package lecture_0318;

// 상속 관계에서의 생성자
//	- 상속 관계의 모든 클래스의 생성자가 실행
//	- 상속 관계에서의 생성자 호출
//		→ 서브 클래스부터 호출
//		→ 서브 클래스의 생성자에서 슈퍼 클래스의 생성자를 바로 호출
//	- 상속 관계에서의 생성자 실행
//		→ 슈퍼 클래스부터 실행
//	→ 슈퍼 클래스의 멤버가 모두 초기화가 되어지면
//	  서브 클래스의 멤버를 초기화한다.

//	- 기본적인 원칙
//	  > 필드(멤버 변수)는 선언된 클래스에서 초기화/설정/반환!
//	  > 슈퍼 클래스의 멤버는 슈퍼 클래스의 생성자를 통해 초기화
//	  > 



class SuperClass {
	int superData;
	SuperClass(){
		System.out.println("SuperClass()");
		superData = 0;
	}
	SuperClass(int superData) {
		System.out.println("SuperClass(int superData)");
		this.superData = superData;
	}
	
	void print() {
		System.out.println("super data = " + superData);
	}
	
}

// SuperClass 클래스를 상속
class SubClass extends SuperClass{
	int subData;
	SubClass() {
		// super();
		this(0, 0);
		System.out.println("SubClass()");
		// subData = 0;
	}
	SubClass(int superData, int subData) {
		// super() 생성자
		//	- 상위 클래스의 생성자를 호출하기 위한 생성자
		//	- 기본적으로 하위 클래스의 생성자에서 상위 클래스의 기본 생성자를 호출
		//	- super() 가 없으면 컴파일러가 맨 첫 줄에 추가시킨 다음 컴파일
		//	- super() 생성자도 반드시 첫 줄에 작성되어야한다.
		//		→ this() 생성자와 같이 작성될 수 없다.
		
		// super 레퍼런스
		//	- 자신의 레퍼런스를 의미
		//	- 자신의 인스턴스 영역 중 슈퍼 클래스의 영역을 참조
		//	- 멤버의 식별자가 같은 경우 서브 클래스의 멤버가 
		//	  우선 순위가 높기 때문에 슈퍼 클래스의 멤버에 접근할 수 없다.
		//	- 이때, 슈퍼 클래스의 멤버에 접근하기 위한 레퍼런스
		super(superData);
		System.out.println("SubClass(int superData, int subData)");
		this.subData = subData * super.superData;
		
	}
	
	void print() {
		super.print();
		// 서브 클래스의 메서드와 동일한 선언부이기 때문에 
		// 슈퍼 클래스의 메서드를 호출할 때 super 레퍼런스를 이용
		System.out.println("sub data = " + subData);
	}
}






public class File01_Constructor {
	public static void main(String[] args) {
		
		SubClass sub1 = new SubClass();
		// 생성자 실행 순서
		// 1. SuperClass(int superData)
		// 2. SubClass(int superData, int subData)
		// 3. SubClass()

		sub1.print();
	}
}
