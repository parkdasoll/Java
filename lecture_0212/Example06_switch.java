package lecture_0212;

import java.util.Scanner;

public class Example06_switch {
	public static void main(String[] args) {
		// 1 ~ 12 사이의 정수를 입력 받아서
		// 아래에 해당하는 값을 출력
		// 	3, 4, 5		: "봄"
		// 	6, 7, 8		: "여름"
		// 	9, 10, 11	: "가을"
		// 	12, 1, 2	: "겨울"
		// 	그 외 	: "잘못 입력된 달입니다."
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a mouth >>> ");
		int mouth = input.nextInt();
		
		switch(mouth) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		default: 
			System.out.println("잘못 입력된 달입니다.");
		}
		
		input.close();
		
	}
}
