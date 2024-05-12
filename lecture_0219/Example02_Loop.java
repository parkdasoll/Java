package lecture_0219;

import java.util.Scanner;

public class Example02_Loop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String calMenu = "========계산기========"
					   + "1. 더하기\n"
					   + "2. 빼기\n"
					   + "3. 곱하기\n"
					   + "4. 나누기\n"
					   + "5. 나머지\n"
					   + "6. 종료\n"
					   + "=====================";
		
		while(true) {
			// 1. 메뉴(항목) 출력
			System.out.println(calMenu);
			
			// 2. 메뉴 항목 입력
			System.out.println("사용할 기능을 입력하세요.");
			System.out.print(">>> ");
			int select = input.nextInt();
			
			// 3. 검사
			//	항목에 없는 기능인 경우 다시 입력받도록 조건식으로 이동
			if (select < 0 || select > 6) {
				System.out.println("없는 기능입니다.");
				continue;
			}
			
			if(select == 6) {
				System.out.println("종료합니다.");
				break;
			}
			
			System.out.print("두 정수를 입력해주세요 : ");
			int n1 = input.nextInt();
			int n2 = input.nextInt();
			int result = 0;
			
			// 연산/처리
			if(select == 1) result = n1 + n2;
			else if(select == 2) result = n1 - n2;
			else if(select == 3) result = n1 * n2;
			else if(select == 4) {
				if (n2 == 0) {
					System.out.println("나눌 수 없는 수 입니다.");
					continue;
				}
				result = n1 / n2;
			}
			else if(select == 5) {
				if (n2 == 0) {
					System.out.println("나눌 수 없는 수 입니다.");
					continue;
				}
				result = n1 % n2;
			}
			
			System.out.println("결과 > " + result);
		}
		
	}
}
