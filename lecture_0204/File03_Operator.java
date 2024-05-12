package lecture_0204;

public class File03_Operator {
	public static void main(String[] args) {
		// 연산자(Operator)
		//	- 연산 : 주어진 식을 계산하여 결과를 얻어내는 과정
		//	- 연산자 : 연산을 하기 위한 문자(기호)
		
		// --------------------------------------------------------
		// 산술 연산자
		//	- 사칙 연산을 하기 위한 연산자
		//		덧셈, 뺄셈, 나눗셈, 곱셈, 추가적으로 나머지 연산
		
		int n1 = 10, n2 = 7;
		
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
		System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
		System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);
		System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
		//	→ 정수 / 정수 = 정수
		//	→ 실수 / 실수 = 실수
		System.out.printf("%d %% %d = %d\n", n1, n2, n1 % n2);
		// - 서식 지정자를 포함한 문자열 내에서
		//	 '%' 문자를 출력하려면 '%%' 로 작성해야한다.
		
	}
}
