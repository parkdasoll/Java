package lecture_0211;

import java.util.Scanner;

public class Example02_Operator {

	public static void main(String[] args) {
		
		// 사용자로부터 입력받은 정수가
		// 짝수이면 "Even number!" 를 출력하고
		// 홀수이면 "Odd number!" 를 출력하는 프로그램을 작성
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer >>> ");
		int n = input.nextInt();
		
		// n 이 짝수이면 "Even number!"
		// 그렇지 않으면 "Odd number!"를 반환
		String result = (n % 2 == 0) ? "Even number!" : "Odd number!";
		
		System.out.println("n is " + result);
	}

}
