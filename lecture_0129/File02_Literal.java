package lecture_0129;

public class File02_Literal {
	public static void main(String[] args) {
		// 리터럴(Literal)
		//	- 연산/입력된 값이 아닌 소스 코드 상에 직접 입력된 값을 의미
		//	- 자료형마다 리터럴이 있다.
		
		// 정수 리터럴
		//  - 소수점이 없는 수를 표현
		//  - 정수 리터럴은 int 형으로 컴파일되며.
		//	  int 형의 표현 범위가 -21억~21억까지 이기 때문에
		//	  범위 밖의 정수르 작성하면 오류가 발생.
		//		→ 정수 리터럴을 long 타입으로 변환하기 위해 리터럴 뒤에 L 또는 l 을 작성
		//	- 정수 리터럴의 종류
		//		10 진수(decimal)		: 0 ~ 9 로 한 자리를 표현하는 진법
		// 		2 진수 (binary)		: 0, 1 로 한 자리를 표현하는 진법
		//		8 진수(octal)			: 0 ~ 7 로 한 자리를 표현하는 진법
		//		16 진수(hexa decimal)	: 0 ~ 9, A ~ F 로 한 자리를 표현하는 진법
		long num1 = 2200000000L;
		
		// 2진수 리터럴
		int bin = 0b1001010;
		
		// 8진수 리터럴
		int octal = 0377;	// 011 111 111
		
		// 16진수 리터럴
		int hexa = 0xf59a;	// 1111 0101 1001 1011
		
		// 실수 리터럴
		//	- 소수점이 있는 수를 표현
		//	- 실수 리터럴은 double 형으로 컴파일
		//	- float 형으로 변환시키려면 리터럴 뒤에 F 또는 f 를 작성
		//	- 지수 표현식을 지원한다.
		double pi = 3.141592;
		float f1 = 3.14f;
		// 지수 표현식
		double d1 = 1.4e-100; // 1.4 * (10의 -100승)
		
		// JDK 1.7 부터 허용된 리터럴 표기법
		//	- 정수, 실수 리터럴에 '_' 를 허용
		//	  컴파일러가 컴파일할 때 '_' 빼고 컴파일한다.
		//	- 허용되지 않는 경우
		//		- 리터럴 끝에는 사용할 수 없다.
		//		- 소수점(.) 앞, 뒤에 사용할 수 없다.
		//		- F, L 앞에 사용할 수 없다.
		//		- 진수 표기하는 문자 사이에 사용할 수 없다.
		int num = 1_000_000;
		double d2 = 3.141_592;

		// 문자 리터럴
		//	- 단 하나의 문자를 표현하며, 작은 따옴표를 이용
		//	- 프로그램이 문자를 처리하는 방식 → 코드로 치환
		//		아스키 코드	= 미국 ANSI 에서 표준화된 정보 교환용 7 비트 부호체계
		//				= 정수 형태로 표현
		//		유니 코드 	= 세계 대부분의 문자를 표현하기 위한 2byte 부호체계
		//				= '\u0000' 와 같은 형식으로 16진수 4자리로 표현
		//	- 문자로 직접 표현할 수 없는 문자들을 표현하기 위한 확장 문자
		//		= 이스케이프 문자(escape character)
		//		종류
		//		 \n	: 개행 문자(new line), 엔터
		//		 \t	: 탭 문자(tab)
		//		 \'	: 작은 따옴표
		//		 \"	: 큰 따옴표
		//		 \\	: 백슬래시 또는 원화
		
		char c1 = 'a';
		char c2 = 65;
		char c3 = '\uAC00';	// = '가'
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		// 아스키 코드는 정수형으로 처리되기 때문에
		// 숫자와 더하기를 하면 정수형으로 결과 값이 반환된다.
		System.out.println(c1 + 5);
		char c4 = (char) (c1 + 5);
		System.out.println(c4);
		
		char c5 = '\'';
		System.out.println(c5);
		
		// 문자열 리터럴
		//	- 다수의 문자들을 묶어서 표현하며, 큰 따옴표를 이용
		//	- 문자열 리터럴은 String 클래스의 객체로 처리
		//	- 문자열은 다른 데이터와 더하기 연산이 가능
		//	  더할 경우 하나의 문자열로 연결한다.
		
		String str1 = "Hello \n\"World\"!";
		System.out.println(str1);
		String str2 = "a"; // 'a' 와 다른 데이터
		System.out.println("Age : " + 30);
		// System.out.println("Age : " + "30");
		// System.out.println("Age : 30");
		System.out.println("num = " + num);
		
		// 논리 리터럴
		//	- 논리형 데이터가 true, false 두개 뿐
		boolean isFlag1 = true;		// 참
		boolean isFlag2 = false;	// 거짓
		
		// null 리터럴
		//	- 참조 타입의 기본 값으로 사용되는 리터럴
		//	- '아무것도 참조하고 있지 않다.' 를 의미
		String str3 = null;
		
		// ---------------------------------------------------
		
		// 상수(constant)
		//	- '변하지 않는 수' 를 의미
		// 	- 한 번 저장되면 수정할 수 없다.
		//	- 프로그램이 끝날 때 까지 바뀌면 안되는 값들을 저장
		//	→ 변수 선언식 앞에 final 키워드를 작성
		
		// YES 를 표현하는 데이터 1
		final int YES = 1;
		// NO 를 표현하는 데이터 
		final int NO = 0;
		// CANCEL 을 표현하는 데이터
		final int CANCEL = -1;
		
		// YES = 2; 에러 발생
		
		// ACCOUNT 를 표현하는 데이터 1
		final int ACCOUNT = 1;
		
	}	
}
























