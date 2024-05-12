package lecture_0318;

public class File02_Casting {
	
	// 학생(Student)과 선생님(Teacher)의 이름과 나이를 출력하는 메서드
	
	// 캐스팅을 활용하지 않을 경우
	//	- 각 클래스 타입 별로 메서드를 정의
	//	- Person 을 상속받는 다른 클래스를 새롭게 정의하면
	//	  해당 메서드 또한 추가해서 정의해야한다.
	/*
	static void print(Student std) {
		System.out.println("print(Student std)");
		System.out.println("Name : " + std.getName());
		System.out.println("Age  : " + std.getAge());
	}
	static void print(Teacher tch) {
		System.out.println("print(Teacher tch)");
		System.out.println("Name : " + tch.getName());
		System.out.println("Age  : " + tch.getAge());
	}
	*/
	
	// Person 클래스의 타입 뿐만 아니라
	// Person 클래스를 상속받는 모든 클래스들의 객체를
	// 매개변수로 참조할 수 있다.(업 캐스팅)
	// → Person 클래스를 상속받는 새로운 클래스를 정의하더라도
	//   해당 메서드에서 바로 사용이 가능하기 때문에 
	//	 따로 추가할 메서드가 없다.
	static void print(Person p) {
		System.out.println("print(Person p)");
		
		// 만약 캐스팅된 인스턴스가 전달됐고
		// 다운 캐스팅을 해야한다면 반드시 클래스 타입을 검사해야한다.
		//	인스턴스의 타입을 검사하기 위한 연산자 : instanceof 연산자
		// → 참조 변수의 타입을 검사하는 것이 아닌
		//	 참조하는 인스턴스(실제 메모리에 있는 객체)를 기준으로 검사
		// → 검사할 때 최하위 클래스 타입부터 검사를 해야한다.
		if(p instanceof Student) {
 			System.out.println("=======학생=======");
		} else if (p instanceof Teacher) {
			System.out.println("======선생님======");
		} else {	// Person 클래스의 인스턴스
			System.out.println("======외부인======");
		}
		
		System.out.println("Name : " + p.getName());
		System.out.println("Age  : " + p.getAge());
	}
	
	
	public static void main(String[] args) {
		// 타입 변환(Casting)
		//	- 기본 자료형의 타입 변환처럼 클래스간의 타입도 변환이 가능하다.
		//	- 상속 관계에 있는 클래스들 사이에서만 변환이 가능하다.
		//		상위 클래스와 하위 클래스간의 변환만 가능
		//	- 종류
		//		업 캐스팅(Up-Casting)
		//		  : 상위 클래스 타입으로 변환
		//		  : 자동으로 변환이 되어진다.
		//		다운 캐스팅(Down-Casting)
		//		  : 하위 클래스 타입으로 변환
		//		  : 강제로 변환을 해야한다.
		//		→ 사람(Person)의 특성을 그대로 가진
		//		  학생(Student)을 사람(Person) 이라고 할 수 있다.
		//			> 업 캐스팅
		//		→ 임의의 사람(Person)을 학생(Student) 또는 선생님(Teacher) 으로
		//		  부를 수 없다.
		//			> 정확히 누구인지 모르기 때문에 직접 지정해서 변환해야한다.
		//			> 다운 캐스팅
		//-------------------------------------------------------------
		
		Student std1 = new Student("홍길동", 17);
		
		Person p1 = std1;	// 업 캐스팅
		// 하위 클래스의 객체를 참조하는 참조 변수에 저장된 주소를 
		// 상위 클래스의 참조 변수에 전달(복사)
		//	= 같은 주소를 참조 = 같은 객체를 참조
		// 	→ 접근할 수 있는 멤버가 제한된다.
		System.out.println("std1.name = " + std1.getName());
		System.out.println("p1.name	  = " + p1.getName());
		p1.setName("Hong");
		// 두 참조 변수가 같은 메모리 주소를 참조하기 때문에
		// 하나의 객체를 공유하게 된다.
		System.out.println("std1.name = " + std1.getName());
		System.out.println("p1.name	  = " + p1.getName());
		
		p1 = new Teacher("Harry", 30);	// 업 캐스팅
		System.out.println("p1.name	  = " + p1.getName());
		
		Teacher tch1 = (Teacher)p1;	// 다운 캐스팅
		// 상위 클래스의 참조 변수에 저장된 주소를 
		// 하위 클래스의 참조 변수에 전달(복사)
		//	- 상위 클래스는 하위 클래스에 대한 정보가 없기 때문에
		//	  클래스 타입을 명시해야한다.
		System.out.println("tch1.name = " + tch1.getName());
		
		// Student std2 = (Student)p1;
		// Student std3 = (Student) new Person();
		// 문법 상으로는 문제가 되지 않는다.
		//	= 사람(Person) 보고 학생(Student) 이라고 할 수는 있다.
		// 단, 현재 사람(Person)이 선생님(Teacher) 이였기 때문에 실행하면 오류가 발생한다.
		
		// 다운 캐스팅같은 경우 무조건 변환이 되어지는 것이 아니라
		// 특정 조건을 만족하는 경우에만 다운 캐스팅이 되어진다.
		//	- 다운 캐스팅하려는 하위 클래스 타입의 멤버가 인스턴스에 있어야한다.
		//	  = 상위 클래스 타입의 참조 변수가 업 캐스팅된 객체를 참조하고 있어야한다.
		
		print(tch1);
		print(std1);
		
	}
}
























