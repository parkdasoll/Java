package lecture_0218;

import java.util.Scanner;

public class Example01_if {
	public static void main(String[] args) {
		// 	시간을 입력을 받고 45분 전의 시간을 출력하는 프로그램을 작성
		// 	시간 단위(24시간, 00:00 ~ 23:59)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a time >>> ");
		int hour = input.nextInt();		
		int minute = input.nextInt();
		// 현재 시간
		//	System.out.println(hour + " : " + minute);
		System.out.printf("%02d : %02d\n", hour, minute);
		
		// 되돌릴 시간
		int timer = 45;
		
		// 현재 시간의 분에서 되돌릴 시간을 뺀다.
		minute -= timer;
		
		// 되돌릴 시간의 분이 음수이면 이전 시간대로 설정
		if(minute < 0) {
			minute += 60; 	// 45분 전의 분
//			hour--;
//			if(hour < 0) hour = 23;
			
			hour = (hour > 0) ? hour - 1 : 23;
		}
		
		
		
		// 45분 전의 시간
		//	System.out.println(hour + " : " + minute);
		System.out.printf("%02d : %02d\n", hour, minute);
	}
}
