package lecture_0212;

public class File01_Conditional {
	public static void main(String[] args) {
		// 조건문
		//	- 조건에 따라 수행할 코드를 결정하는 제어문

		//	중첩 조건문
		//	- 조건문 내에 또 다른 조건문을 작성한 형태
		//	- 다수의 조건 분기를 나눌 때 사용되거나
		//	  여러 분기에 공통적으로 처리할 코드가 있는 경우
		//	- 되도록이면 사용하는 것을 피하는 것이 좋다
		
		int n = 15;
		
		// n의 값이 10 보다 크면 "n이 10 보다 큽니다."를 출력
		// n의 값이 10 보다 작으면 "n이 10 보다 작습니다."를 출력
		// n의 값이 10 과 같으면 "n이 10 과 같습니다." 를 출력
		if(n > 10) {
			System.out.println("n이 10 보다 큽니다.");
		} else {
			System.out.println("n이 10 보다 크지 않고, ");
			if(n < 10) {
				System.out.println("n이 10 보다 작습니다.");
			} else {
				System.out.println("n이 10 과 같습니다.");
			}
			
		}
		System.out.println("-------------------------------------------");
		//------------------------------------------------------------------
		// if-else if 문
		//	- 다수의 조건에 의해 수행할 코드를 결정하는 조건문
		//	- 기존에 조건식을 작성할 수 없었던 else 문에
		//	  조건식을 작성하기 위한 if 문을 합친 구문
		//		else + if( )
		//	- else if 문의 제한 수는 없으며, 마지막에는
		//	  else 문을 선택적으로 작성할 수 있다.
		
		System.out.println("if-else if 문");
		// n의 값이 10 보다 크면 "n이 10 보다 큽니다."를 출력
		// n의 값이 10 보다 작으면 "n이 10 보다 작습니다."를 출력
		// n의 값이 10 과 같으면 "n이 10 과 같습니다." 를 출력
		if(n > 10) {
			System.out.println("n이 10 보다 큽니다.");
		} else if (n < 10) {
			System.out.println("n이 10 보다 작습니다.");
//		} else if (n == 10) {
		} else { // 크지도 않고, 작지도 않은 경우는 같은 경우 밖에 없다.
			// = 위의 모든 조건을 만족하지 않은 경우에 수행
			System.out.println("n이 10과 같습니다.");
		}
		
		
		System.out.println("-------------------------------------------");
		//------------------------------------------------------------------
		
		// switch 문
		//	- if 문과는 달리 조건이 아닌 값에 의해 분기가 나뉜다.
		//	- switch 문은 하나의 블록으로만 작성되며
		//	  블록 내에서 분기가 나뉜다.
		//	- 분기를 나눌 때 case 문을 이용하여 값을 지정하고
		//	  값이 일치하는 경우 해당 case 문부터 블록 끝까지 실행
		//		→ 블록 내의 시작 위치를 결정하는 구문
		//	- 각 case 문의 코드만 수행하려면 'break' 문을 통해
		//	  switch 문의 블록을 종료
		//	- case 문 뒤에 값을 지정할 때
		//		: 리터럴(실수 제외), 상수, enum 만 작성될 수 있다.
		System.out.println("switch 문");
		
		int select = 1;
		
//		if(select == 1) System.out.println("1st menu");
//		else if(select == 2) System.out.println("2st menu");
//		else if(select == 3) System.out.println("3st menu");
//		else System.out.println("Not include menu");

		switch(select) {
		case 1: //select == 1
			System.out.println("1st menu");
			break;	// switch 문 종료
		case 2: //select == 2
			System.out.println("2st menu");
			break;	// switch 문 종료
		case 3: //select == 3
			System.out.println("3st menu");
			break;	// switch 문 종료
		default: // else 와 같은 역할
			System.out.println("Not include menu");
		}
		
		
		
	}
}




















