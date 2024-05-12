package lecture_0212;

import java.util.Scanner;

public class Example03_if {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 정수 값을 검사하여
		// 값에 맞는 결과를 출력
		//	- 3의 배수인 경우 : Fizz
		//	- 5의 배수인 경우 : Buzz
		//	- 3의 배수이면서 5의 배수인 경우 : FizzBuzz
		//	- 그 외인 경우 : 정수 값
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer >>> ");
		
		int n = input.nextInt();
		
		if(n % 3 == 0 && n % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (n % 3 == 0) {
			System.out.println("Fizz");
		} else if (n % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(n);
		}
		
		input.close();
	}
}
