package lecture_0211;

import java.util.Scanner;

public class Example01_Operator {

	public static void main(String[] args) {
		// 1. 사용자로부터 정수를 입력받고
		// 입력받은 정수가 50 보다 큰 3의 배수이거나
		// 100 보다 큰 7의 배수인지 검사하고 출력하는 프로그램을 작성
		
		// 사용자로부터 입력을 받기 위해 Scanner 객체를 생성
		Scanner input = new Scanner(System.in);	
		
		// 사용자로부터 정수를 입력
		System.out.print("Enter an integer >>> ");
		int n = input.nextInt();
		
		// 50 보다 큰 3의 배수인지 검사
		boolean conditionA = (n > 50) && (n % 3 == 0);
		
		// 100 보다 큰 7의 배수인지 검사
		boolean conditionB = (n > 100) && (n % 7 == 0);
		
		// 조건 A를 만족하거나 조건 B를 만족하는 검사
		boolean result = conditionA || conditionB;
		
		System.out.println(">>> " + result);
		
		
		
	}

}
