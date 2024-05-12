package lecture_0219;

public class File02_Array {
	public static void main(String[] args) {
		// 배열(Array)
		//	: 같은 타입의 저장 공간을 하나의 묶음으로 다루는 자료구조
		//		- 공통된 특징이나 목적에 따라 묶어서 사용
		//	: 다수의 저장 공간을 하나의 식별자로 다룬다.
		//		→ 하나의 저장 공간		= 원소(item)
		//		→ 각 저장 공간의 번호 	= 인덱스(index)
		//	= 인덱스와 인덱스에 대응하는 원소들로 구성된 데이터의 집합체
		
		// 변수만으로는 프로그램을 만들기에는 한계가 있다.
		//	1. 저장할 수 있는 데이터의 수가 정해져 있다.
		//	2. 프로그램을 사용하는 사용자가 원하는 변수에
		//	   접근시키는데 한계가 있다.
		//	3. 연산/처리 과정을 작업하는데 있어서 비효율적이다.
		//	→ 다수의 데이터들을 효율적으로 관리하기 위한 배열을 다룰 필요가 있다.
		
		// 배열 선언
		//	- 배열에 저장될 원소의 타입과 배열을 의미하는 대괄호([])를 통해 타입을 명시
		//	- 대괄호([])는 식별자의 앞 또는 뒤에 작성할 수 있으며
		//	  대괄호([]) 안에 아무것도 작성하지 않는다.
		//	- 이때 선언된 변수는 배열의 위치(메모리 주소)를 저장하는
		//	  참조(Reference) 변수이다.
		
		// 배열 생성
		//	- 배열 선언 단계에서 만들어진 식별자는 원소들의 묶음이 아니다.
		//	- 실제 원소들의 묶음을 생성하려면 'new' 연산자를 통해 생성해야한다.
		//	- new 연산자와 원하는 타입과 개수를 지정
		//		new 타입[개수]
		//	- new 연산자: 메모리를 원하는 만큼 할당을 받고 주소를 반환하는 연산자
		
		
		// 10개의 정수(int)를 저장할 배열을 선언
		final int MAX = 5;
		int[] numbers = new int[MAX];
		
		System.out.println("numbers = " + numbers);
		// numbers = [I@626b2d4a
		//	→ [I 		: int 형 배열
		//	→  @ 		: 구분자 
		//	→  626b2d4a : 배열이 저장된 메모리의 주소
		
		// 배열의 원소 접근
		//	- 배열의 원소(저장 공간)에 접근하기 위해서는
		//	  배열을 참조하는 참조 변수와 접근하고자 하는 원소의 인덱스를 지정
		//	- 인덱스 	: 0 부터 1씩 증가하는 정수
		//			: 첫 번째 원소(저장 공간)의 인덱스 = 0
		//			: 두 번째 원소(저장 공간)의 인덱스 = 1
		//			→ 인덱스의 범위 : 0 <= index < 원소의 개수
		
		// variable[index] 	: index 에 위치한 원소에 접근
		//					: 원소의 값을 사용하거나 다른 값으로 저장할 수 있다.
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		
		// 배열의 인덱스가 정수이기 때문에
		// 배열의 모든 원소를 다룰 때 반복문을 같이 사용한다.
		for(int i = 0; i < MAX; i++) {
			numbers[i] = i * 10;
		}
		
		// 배열의 길이(length)
		//	= 배열의 원소의 개수
		//	= JVM이 모든 배열의 길이를 관리
		//	= 배열을 참조하는 참조 변수의 length 속성을 이용
		
		int length = numbers.length;
		
		for(int i = 0; i < length; i++) {
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}
		
		// 배열의 초기화
		//	- 배열을 맨 처음 생성하면 기본 값으로 초기화가 되어진다.
		//		0, 0.0, false, null
		//	- 배열의 길이는 저장되는 값의 갯수로 맞춰진다.
		//	- 참조 변수의 선언과 동시에 초기화 할 경우 'new int[]'을 생략할 수 있다.
		int[] numbers2 = new int[] {50, 40, 30, 20, 10};
		int[] numbers3 = {50, 40, 30, 20, 10};	// 'new int[]' 가 생략
		
		// 이미 선언된 참조 변수에 배열을 초기화하여 저장할 때는 
		//	'new int[]'을 작성해줘야 한다.
		numbers2 = new int[] { 100, 50, 40 };
		// numbers3 = {100, 50, 40, 30, 20, 10, 0};	// 오류 발생
		
		for(int i = 0; i < numbers2.length;i++) {
			System.out.println("numbers2[" + i + "] = " + numbers2[i]);
		}
		
		// int total = numbers2[0] + numbers[1] ...;
		int total = 0;
		for(int i = 0; i < numbers2.length; i++) {
			total += numbers2[i];
		}
		System.out.println("total = " + total);
		System.out.println("average = " + (double)total/numbers2.length);
	}
}



















