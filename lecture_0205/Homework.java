package lecture_0205;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		// 1. 사용자로부터 정수를 입력을 받고
		//    입력받은 정수가 50 보다 큰 3의 배수이거나 
		//    100 보다 큰 7의 배수인지 검사인지 출력하는 프로그램을 작성
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer >>> ");
		int num = input.nextInt();
		
		boolean resultA = (num > 50) && (num % 3 ==0);
		boolean resultB = (num > 100) && (num % 7 ==0);
		
		boolean result = resultA || resultB;
		
		System.out.println(">>> " + result);
		
		
		input.close();
	}
}
