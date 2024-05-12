package lecture_0218;

public class File01_Loop {
	public static void main(String[] args) {
		//	반복문(Loop Statement)
		//	- 코드를 반복 수행하기 위한 제어문
		//	- 주어진 조건을 만족하는 동안 코드를 수행한다.
		//	- 종류
		//		while 문
		//		  : 특정 조건을 만족하는 동안 반복 수행
		//		do-while 문	
		//		  : 특정 조건을 만족하는 동안 반복 수행, 최소 1번
		//		for 문
		//		  : 특정 횟수, 범위를 다룰 때 사용
		//		for-each 문 
		//		  : 배열, 컬렉션을 순차 탐색하며 반복 수행
		//	→ 어떤 반복문을 이용하더라도 기능은 구현이 가능하지만
		//	  용도에 맞게 사용하는 것이 좋다.
		//--------------------------------------------------------
		System.out.println("No Loop");
		
		// "Hello World!" 를 다섯 번 출력
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		// → 중복된 코드
		// → 원하는 수 만큼 동작시킬 수 없다.
		
		//--------------------------------------------------------
		// while 문
		//	- while : ~ 하는 동안
		// 	- 특정 조건을 만족하는 동안 반복 수행하는 반복문
		//	- 조건에 의해 동작되는 반복문이기 때문에 조건식만 작성
		//		→ 구조가 if 와 유사
		
		System.out.println("while 문");
		
		// while 문을 이용하여
		// "Hello World!" 를 다섯번 출력
		
		// 출력 횟수를 검사하는 것과 같이 카운팅을 하려면
		// 1. 카운팅 정보를 저장할 변수 선언 또는 초기화 
		// 2. 카운트 목표까지 달성했는지 조건 검사
		// 3. 기능 수행 다음 카운트

		// 출력 횟수를 저장하기 위한 변수
		int printCount = 0;
		
		
		while( printCount < 5/* 출력 횟수가 다섯을 출력했는가? */ ) {
			// 0 < 5 → true
			// 1 < 5 → true
			// 2 < 5 → true
			// 3 < 5 → true
			// 4 < 5 → true
			// 5 < 5 → false → 반복문을 더 이상 수행하지 않고 종료
			
			// 출력
			System.out.println(printCount + "Hello World!");
			
			// 출력이 되었으니 출력 횟수를 1 증가
			printCount++;
			
		} 	// while, 블록이 끝나면 while 문의 조건식으로 넘어가 다시 검사한다.
		
		
		//--------------------------------------------------------
		// do-while 문
		//	- while 문처럼 조건에 의해 반복 수행하는 반복문 
		//	- while 문과의 차이점
		//		while 문 	: 선 검사, 후 실행
		//		do-while 문 	: 선 실행, 후 검사
		
		// do-while 문을 이용하여 
		//	"hello World!" 를 다섯 번 출력
		System.out.println("do-while 문");
		printCount = 0;
		
		do {
			System.out.println("Hello World!");
			printCount++;
		} while(printCount < 5);
		
		//--------------------------------------------------------
		// for 문
		//	- 특정 횟수, 범위를 다룰 때 사용되는 반복문
		//	- 반복문에 필요한 변수 선언과 증감식을 한 번에 작성
		//	- 구조는 제어문 중에서 제일 복잡하긴 하지만
		//	  직관적이라서 이해하는데는 어렵지 않다.
		//	- 구조
		//		for (초기식; 조건식; 반복 후 처리)
		//			...
		//		→ 초기식
		//		  for 문에서 사용할 변수를 선언 및 초기화
		//		→ 반복 수행하기 위한 조건
		//		  반복 수행하기 위한 조건
		//		→ 반복 후 처리
		//		  반복 수행이 끝난 다음 수행할 명령어
		//		  일반적으로 초기식에 선언된 변수의 값을 연산
		//		  쉼표를 구분으로 다수의 명령어를 작성할 수 있으며
		//		  작성된 순서대로 수행한다.
		
		// for 문을 이용하여 
		//	"Hello World!" 를 다섯 번 출력
		System.out.println("for 문");
		
		for(int count = 0; count < 5; count++) {
			// count 의 값이 0 부터 5가 될 때 까지 1씩 증가하는 for 문 
			
			// 조건식의 결과가 true 이면 반복 수행을 한다.
			// 반복 수행이 끝난 다음 '반복 후 작업'의 명령어를 수행
			// 명령어를 수행 한 다음 다시 조건식을 검사
			System.out.println("Hello World!");
		}
	
		
	} 	// main
} 	// class

























