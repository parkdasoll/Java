package lecture_0218;

public class Example07_for {
	public static void main(String[] args) {
		
		// 구구단 중 7단을 출력하는 for 문을 작성
		
		// 7단
		//	7 * 1 = 7
		//	7 * 2 = 14
		//	...
		//	7 * 9 = 63
		
		// 출력할 단
		int dan = 7;
		System.out.println(dan + "단");
		
		for(int n = 1; n <= 9; n++) {
			// n의 값이 1 부터 9가 될 때까지 1씩 증가하는 반복문
			
			System.out.printf("%d * %d = %d\n", dan, n, dan * n);
		}
		
		
	}
}
