package lecture_0212;

import java.util.Scanner;

public class Example07_if {
	public static void main(String[] args) {
		// 시간을 입력을 받고 45분 전의 시간을 출력하는 프로그램을 작성
		// 시간 단위(24시간, 00:00 _ 23:59)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a time >>> ");
		int hour = input.nextInt();
		int minute = input.nextInt();
		
		int fullHour = 24;
		int fullMinute = 60;
		int prev = 45;
		
		// 현재 시간
		System.out.println(hour + " : " + minute);
		
		// 45분 전의 시간
		if (minute > prev) {
			System.out.println(hour + " : " + (minute - prev));
		} else if (hour == 0 && minute < prev) {
			System.out.println((fullHour - 1) + " : " + (fullMinute + minute - prev));
		} else {
			System.out.println((hour - 1) + " : " + (fullMinute + minute - prev));
		}
	
	}
}
