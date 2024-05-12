package lecture_0225;

// 사칙 연산을 하기 위한 계산기(Calculator)를 작성

// 아래의 연산을 하여 결과 값을 반환하는 메서드를 작성
// - 더하기(add)
// - 빼기(sub)
// - 곱셈(mul)
// - 나누기(div)
// - 나머지(mod)

// 나누기와 나머지 연산을 할 때 두 번째 매개변수의 값이 0 이면
// 오류가 발생하기 때문에 미리 검사하여 0 인 경우
// "0으로 나눌 수 없습니다." 를 출력하고 0 으로 반환
class Calculator {
	
	int add(int x, int y) {
		return x + y;
		// → 연산된 값을 반환
	}
	int sub(int x, int y) {
		return x - y;
	}
	int mul(int x, int y) {
		return x * y;
	}
	int div(int x, int y) {
		if(y == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
			// → 나누기 연산을 할 수 없기 때문에
			//	 메서드의 결과 값을 0 으로 반환
			// → 메서드가 종료
		}
		return x / y;
	}
	
	// 나중에 배울 예외 처리를 이용하면
	// 원하는 방식으로 오류를 해결 할 수 있다.
	int mod(int x, int y) {
		return x % y;
	}
}

public class Example02_Calculator {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int x = 10, y = 0;
		
		try {
			System.out.printf("%d + %d = %d\n", x, y, cal.add(x, y));
			System.out.printf("%d - %d = %d\n", x, y, cal.sub(x, y));
			System.out.printf("%d * %d = %d\n", x, y, cal.mul(x, y));
			System.out.printf("%d / %d = %d\n", x, y, cal.div(x, y));
			System.out.printf("%d %% %d = %d\n", x, y, cal.mod(x, y));
		} catch(ArithmeticException e) {
			System.out.println("나눌 수 없는 수입니다.");
		}
		
		
		
	}
}
