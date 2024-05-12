package lecture_0212;

import java.util.Scanner;

public class Example01_if {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 값이 양수, 음수, 0 인지 출력
		// 양수(positive number) : 0 보다 큰 수
		// 음수(negative number) : 0 보다 작은 수
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer >>> ");
		
		int n = input.nextInt();
		
		if (n > 0) {
			System.out.println("n is positive number!");
		} else if (n < 0) {
			System.out.println("n is negative number!");
		} else {
			System.out.println("n is 0!");
		}
		
		input.close();
	}
}
