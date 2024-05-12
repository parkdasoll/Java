package lecture_0205;

import java.util.Scanner;

public class Example01_Operator {
	public static void main(String[] args) {
		// 사용자로부터 정수를 입력을 받아서
		// 사용자가 입력한 정수가 양수인지 출력하는 프로그램을 작성
		//  양수(positive number) : 0 보다 큰 수
		
		// 사용자로부터 입력을 받기 위해 Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 사용자로부터 정수를 입력
		System.out.println("Enter an integer >>> ");
		int n = input.nextInt();
		
		// 양수인지 검사하여 결과 값을 boolean 타입 변수에 저장
		boolean isPositive= n > 0;
		
		System.out.println("Is n positive number? " + (isPositive));
		
		input.close();
	}
}

























