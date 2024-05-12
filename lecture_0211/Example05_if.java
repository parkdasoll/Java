package lecture_0211;

import java.util.Scanner;

public class Example05_if {

	public static void main(String[] args) {
		// 사용자로 부터 점수를 입력을 받고
		// 만약 점수가 0 이상 100 이하가 아닌 경우
		// 0 점이 되도록 프로그램을 작성

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a score >>> ");
		int score = input.nextInt();
		
		if(score >= 0 && score <= 100) {
			System.out.println("SCORE = " + score);
		}else {
			System.out.println("SCORE = " + 0);
		}
		
		// 점수가 유효한 값이 아니면 0 으로 설정
		if(score < 0 || score > 100) {
			score = 0;
		}
		
		System.out.println("SCORE = " + score);
		
	}

}
