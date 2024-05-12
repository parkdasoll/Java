package lecture_0218;

import java.util.Scanner;

public class Example08_for {
	public static void main(String[] args) {
		// 두 정수 a, b를 입력을 받고
		// a, b를 포함한 두 정수 사이의 정수들을
		// 오름차순으로 출력하는 for 문을 작성
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two integers >>> ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		/*
		if(a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		*/
		
		int max = a > b ? a : b;
		int min = a < b ? a : b;
		
		
		for(int i = min; i <= max; i++) {
			System.out.println("n = " + i);
		}
		
		//--------------------------------------------------
		System.out.println("-----------------------------------");
		// a 와 b 를 포함한 사이의 값을 차례대로 출력하는 for 문
		//	5, 10 → 5 6 7 8 9 10
		//	10, 5 → 10 9 8 7 6 5
		
		/*
		if(a > b) {
			for(int n = a; n >= b; n--) {
				System.out.println("n = " + n);
			} 
		} else {
			for(int n = a; n <= b; n++) {
				System.out.println("n = " + n);
			}
		}
		*/
		
		// a 부터 b 까지의 증가량
		int step = a < b ? 1 : -1;
		
		for(int n = a, end = b + step; n != end; n += step) {
			System.out.println("n = " + n);
		}
		
		
		
	}
}
