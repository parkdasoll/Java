package lecture_0218;

import java.util.Scanner;

public class Example09_Loop {
	public static void main(String[] args) {
		
		// 임의의 정수를 입력을 받고
		// 각 자리의 정수를 출력하는 반복문을 작성
		
		// Enter an integer >>> 312455
		
		// 1's digit : 5
		// 2's digit : 5
		// 3's digit : 4
		// ...
		// 6's digit : 3
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer >>> ");
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i *= 10) {
			int num = (n / i) % 10;
			System.out.printf("%d's digit : %d\n", i, num);
		}
		
		
	}
}
