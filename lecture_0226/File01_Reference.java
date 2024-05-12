package lecture_0226;

public class File01_Reference {
	public static void main(String[] args) {
		
		// 참조(Reference)
		// - '무언가를 가리킨다.'
		// 참조 변수(Reference Variable)
		//	- 메모리 주소를 통해 무언가를 가리키는 변수
		// 	- 메모리의 주소를 저장하는 변수
		// → 객체, 배열
		
		//-----------------------------------------------
		int a = 10;
		int b = a;	// 변수 a 의 값을 변수 b 에 복사
		System.out.println("a = " + a + ", b = " + b);
		a = 15;
		System.out.println("a = " + a + ", b = " + b);
		// → 변수의 값을 다른 변수에 대입할 경우
		//	 값을 복사하여 전달한다.
		//----------------------------------------------------
		Student std1 = new Student();
		std1.name = "홍길동";
		
		Student std2 = std1;	// 참조변수 std1 의 값을 참조변수 std2 에 복사
		// 참조 변수에 저장된 값은 메모리 주소이므로
		// std2 에는 std1 이 참조하는 메모리 주소를 받게 된다.
		// → std1 과 std2 는 동일한 메모리 주소를 참조한다.
		//	즉, 같은 객체를 공유하게 된다.
		// → 이와 같이 객체의 주소를 복사하는 경우를 '얕은 복사(shallow copy)' 라고 한다.
		//	 생성자를 통해 동일한 필드를 갖는 객체를 복사하는 경우를 '깊은 복사(deep copy)' 라고 한다.
		
		System.out.println("std1 = " + std1.name + ", std2 = " + std2.name);
		std1.name="김철수";
		System.out.println("std1 = " + std1.name + ", std2 = " + std2.name);
	}
}
