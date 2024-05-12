package lecture_0205;

public class Example03_Operator {
	public static void main(String[] args) {
		
		// 0 <= x < 50 사이의 값인지 검사
		int x = -5;
		
		// 0 <= x < 50 와 같은 식을 작성할 수 없기 때문에
		// 비교 연산을 두 개로 나누어야한다.
		//  - x 가 0 이상인 경우
		//  - x 가 50 미만인 경우
		boolean result = (x >= 0) && (x < 50);
		System.out.println("0 <= x < 50  : " + result);
	}
}

