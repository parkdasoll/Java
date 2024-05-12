package lecture_0211;

import java.util.Scanner;

public class Example04_Operator {

	public static void main(String[] args) {
		
		// 사용자로부터 두 개의 정수를 입력을 받고
		// 두 정수 중 큰 값과
		// 두 정수의 차이를 절대 값으로 출력하는 프로그램을 작성
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two integers >>> ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		// n1 이 n2 보다 크면 n1 이 큰 값이
		// 그렇지 않으면 n2 가 큰 값
		int bigger = n1 > n2 ? n1 : n2;
		
		System.out.println("bigger = " + bigger);
		
		// 두 정수의 차이의 절대 값
		
		// 1. 큰 값에서 작은 값을 빼도록 연산
		int abs1 = n1 > n2 ? n1 - n2 : n2 - n1;
		System.out.println("|n1 - n2| = " + abs1);
		
		// 2. 뺀 값이 음수이면 양수로 연산
		int diff = n1 - n2;
		
		int abs2 = diff >= 0 ? diff : -diff;
		System.out.println("|n1 - n2| = " + abs2);
	}

}
