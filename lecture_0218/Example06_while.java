package lecture_0218;

import java.util.Scanner;

public class Example06_while {
	public static void main(String[] args) {
		// while 문은 조건에 의해 동작이 되어지는 반복문
		//	→ 언제 끝날지 명확하지 않다.
		
		// 사용자가 입력한 양수를 출력하는 프로그램을 작성
		// 만약 음수를 입력한 경우 다시 입력 받도록 작성
		Scanner input = new Scanner(System.in);
		
		
		/*
		System.out.print("Enter an integer >>> ");
		int n = input.nextInt();
		
		// 입력된 값이 0 이하면 다시 입력받독록 반복문을 작성
		while(n <= 0) {
			System.out.print("Enter an integer >>> ");
			n = input.nextInt();
		}
		*/
		int n = 0;
		do {
			System.out.print("Enter an integer >>> ");
			n = input.nextInt();
		}while(n <= 0);
		
		System.out.println("n = " + n);
	}
}
