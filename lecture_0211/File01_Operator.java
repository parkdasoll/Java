package lecture_0211;

public class File01_Operator {

	public static void main(String[] args) {
		// 조건 연산자
		//	- 조건에 따라 데이터 또는 표현식을 반환시키는 연산자
		//	- 조건을 표현한 조건식의 결과는 논리 값(true, false)으로 반환
		//	- 피 연산자가 3개이며 유일한 삼항 연산자
		//	- 표현식
		//		조건식 ? true 일 때의 표현식 : false 일 때의 표현식;
		
		// 점수가 70점 이상이면 합격, 아니면 불합격
		int score = -150;
		
		System.out.println("Is Pass?" + (score >= 70));
		
		// score >= 70
		//	true → "합격", "Pass"
		//	false→ "불합격", "Fail"
		
		System.out.println( (score >= 70 ? "Pass" : "Fail") );
		// 조건에 따라 원하는 값을 반환받을 수 있다.
		
		// 점수가 정상적인 값이면 그대로 저장하고
		// 범위 밖의 점수이면 0점으로 처리
		score = (score >= 0 && score <= 100) ? score : 0;
		
		System.out.println("score = " + score);
		//--------------------------------------------------------------
		
		// 비트 연산자
		//	- 비트 단위로 연산하는 연산자
		//	- 종류
		//		비트 논리 연산자
		//			: 비트 단위로 논리 연산(AND, OR, XOR, NOT)
		//		비트 시프트 연산자
		//			: 비트 단위로 이동 연산
		
		// 다수의 상태를 처리하기 위한 데이터들을 한 번에 관리
		
		// 1 번 전등의 전등 유무
		// boolean isLight1 = false;
	
		// 20 개의 전등의 상태를 관리하기 위해
		// 20개의 boolean 타입 변수가 아닌
		// 32bit 인 int 타입 변수 하나를 이용
		int lightState = 0b0000_0000_0000_0001_0001;
		final int LIGHT_MASK =0b1111_1111_1111_1111_1111;
		// → bit 를 사용하기 위한 단위
		
		// 모든 전등 ON
		// 	= 20개의 bit 를 1 로 변환
		lightState |= LIGHT_MASK;
		
		// 모든 전등 OFF
		//	= 20개의 bit 를 0 으로 변환
		lightState &= (~LIGHT_MASK);
		// ~LIGHT_MASK = 0b1111_1111_1111_0000_0000_0000_0000_0000;
		
		// n 번째 전등
		int lightNum = 5;
		
		int lightBit = 1 << (lightNum - 1);
		// 5번 전등 = 0b0000_0000_0000_0001_0000
				
		// n 번째 전등 ON
		lightState |= lightBit;
		
		// n 번째 전등 OFF
		lightState &= (~lightBit);
		
		// Toggle → ON/OFF
		//	n 번째 전등이 ON 이면 OFF, OFF 이면 ON
		lightState ^= lightBit;
	}

}












