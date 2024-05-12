package lecture_0205;

import java.util.Scanner;

public class Example02_Operator {
	public static void main(String[] args) {
		
		// 사용자로부터 정수를 입력을 받아서
		// 사용자가 입력한 값이 짝수인지 출력하는 프로그램을 작성
		//  짝수(even number) : 2의 배수
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer >>> ");
		int n = input.nextInt();
		
		// 2의 배수 = 2 로 나눴을 때 나머지가 0 인 수
		boolean isEven = (n % 2 ) == 0;
		
		System.out.println("Is n even number?" + isEven );
		
		input.close();
	}
}


















