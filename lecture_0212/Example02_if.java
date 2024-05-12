package lecture_0212;

import java.util.Scanner;

public class Example02_if {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 정수가
		// 짝수, 홀수, 0 인지 출력
		// 짝수(even number) : 2의 배수
		// 홀수(odd number) : 2의 배수가 아닌수
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer >>> ");
		
		int n = input.nextInt();
		
		
		
		// case1.
		if (n % 2 == 0 && n > 0) {
			System.out.println("n is odd number!");
		} else if (n % 2 != 0) {
			System.out.println("n is odd number!");
		} else if (n == 0) {
			System.out.println("n is 0!");
		}
		
		// case2.
		if (n == 0) {
			System.out.println("n is 0!");
		} else if (n % 2 == 0) {
			System.out.println("n is even number!");
		} else {
			System.out.println("n is odd number!");
		}
		
		
		input.close();
		
		
	}
}
