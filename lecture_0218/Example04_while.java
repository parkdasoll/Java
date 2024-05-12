package lecture_0218;

public class Example04_while {
	public static void main(String[] args) {
		// 1부터 20까지의 수 중에서 짝수만 출력하는 while 문을 작성
		
		int n = 1;
		
		while(n <= 20 /* 반복 수행을 하기 위한 조건 */) {
			// n 의 값이 짝수이면 출력
			if(n % 2 == 0)
				System.out.println("n = " + n);
			
			// 홀수, 짝수 여부 상관 없이 1 증가
			n++;
		}
	}
}
