package lecture_0212;

import java.util.Scanner;

public class Example04_if {
	public static void main(String[] args) {
		// 369게임
		// 1 ~ 99 사이의 정수를 입력을 받고
		// 정수 값 중에 3, 6, 9 중 한 개가 있으면 "박수 짝!"을 출력 
		// 정수 값 중에 3, 6, 9 중 두 개가 있으면 "박수 짝짝!"을 출력 
		// 하나도 없으면 정수 그대로 출력 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer 1 and 99 >>> ");
		int n = input.nextInt();
		
		// 일의 자리
		int firstDigit = n % 10;
		
		// 십의 자리
		int secondDigit = n / 10;
		
		// 일의 자리가 3, 6, 9 중 하나인지 검사
		boolean firstMultiple = (firstDigit > 0 && firstDigit % 3 == 0) ;
		// 십의 자리가 3, 6, 9 중 하나인지 검사
		boolean secondMultiple = (secondDigit > 0 && secondDigit % 3 == 0);
		
		
		if(firstMultiple && secondMultiple) {
			System.out.println("박수 짝! 짝!");
		} else if (firstMultiple || secondMultiple) {
			System.out.println("박수 짝!");
		} else {
			System.out.println(n);
		}
		
		input.close();
		
	}
}
