package lecture_0218;

public class Example03_while {
	public static void main(String[] args) {
		
		// 1부터 20까지의 정수를 역순으로 출력하는 while 문을 작성
		// n = 20
		// n = 19
		// n = 18
		// ...
		// n = 1
		
		int n = 20;
		
		while(n >= 1) {
			System.out.println("n = " + n);
			n--;
		}
				
				
	}
}
