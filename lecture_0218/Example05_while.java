package lecture_0218;

public class Example05_while {
	public static void main(String[] args) {
		// 1 부터 20까지의 합을 구하는 while 문을 작성
		
		//	1 + 2 + 3 + ... + 20;
		int n = 1;
		int sum = 0;
		
		
		
		while(n <= 20) {
			sum += n;
			
			n++;
		}
		System.out.println("sum = " + sum);
	}
}
