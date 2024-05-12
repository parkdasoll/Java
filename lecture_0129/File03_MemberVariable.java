package lecture_0129;


// 변수의 종류
//	- 지역 변수
//		: 메서드 내에 선언된 변수
//	- 매개 변수
//		: 메서드의 선언식에 작성된 변수
//	- 멤버 변수
//		: 클래스 내에 선언된 변수
public class File03_MemberVariable {
	// 멤버 변수 = 필드
	//	- 클래스 내의 모든 메서드에서 사용할 변수
	 int a = 40;	
	 int b = 50;	
	
	
	// int x = 매개 변수
	void method(int x) {
		int a = 10;	// 지역 변수
		
		
		// 지역변수와 매개변수는
		// 선언된 메서드에서 사용하기 위한 변수
		// 메서드가 종료되면 사라진다.
		
		// 한 메서드 내에 동일한 식별자의 변수가 있을 수 없다.
		// 단, 멤버 변수와 지역 변수의 식별자가 같아도 오류가 발생하지는 않는다.
		// 이때, 우선 순위가 높은 것은 가장 안쪽에 해당하는 변수가 높기 때문에
		// 지역 변수에 접근한다.
		System.out.println(a);	// 지역 변수
		System.out.println(b);	// 멤버 변수
	}
	
	
	
	public static void main(String[] args) {
		// System.out.println("a = " + a);
		
	}
	
}
