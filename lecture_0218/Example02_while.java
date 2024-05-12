package lecture_0218;

public class Example02_while {
	public static void main(String[] args) {
		// 1. 1부터 20까지의 정수를 출력하는 while문을 작성
		//		n = 1
		//		n = 2
		//		...
		//		n = 20
		
		int n = 1;
		
		while(n <= 20) {
			System.out.println("n = " + n);
			n++;
		}
	}
}
