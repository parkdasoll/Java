package lecture_0205;

import java.util.Scanner;

public class Example04_Operator {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 정수가
		// 30 보다 큰 5의 배수인지 출력하는 프로그램을 작성
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer >>> ");
		int num = input.nextInt();
		
		// 30 보다 크고 5의 배수인지 검사
		boolean result = (num > 30) && (num % 5 == 0);
		
		System.out.println("Is n a multiple of 5 greater than 30?");
		System.out.println(">>> " + result);
		
		input.close();
		
	}
}
















