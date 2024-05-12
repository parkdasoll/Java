package lecture_0219;

import java.util.Scanner;

public class Example01_Loop {
	public static void main(String[] args) {
		
		
		// 임의의 정수를 입력을 받고
		// 각 자리의 정수를 출력하는 반복문을 작성
				
		// Enter an integer >>> 312455
				
		// 1's digit : 5	→ (312455 / 1) % 10
		// 2's digit : 5	→ (312455 / 10) % 10
		// 3's digit : 4	→ (312455 / 100) % 10
		// ...
		// 6's digit : 3	→ (312455 / 100000) % 10
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer >>> ");
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i *= 10) {
			int num = (n / i) % 10;
			System.out.println(i + "의 자리 수" + num);
		}
		
		
		
		
		
	}
}





















