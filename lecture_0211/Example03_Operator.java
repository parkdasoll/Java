package lecture_0211;

import java.util.Scanner;

public class Example03_Operator {

	public static void main(String[] args) {

		// 사용자로 부터 두 개의 점수를 입력을 받고
		// 두 점수가 각각 40점 이상이거나
		// 두 점수의 평균이 50점 초과인지 검사하여
		// 만족할 경우에는 "합격"을 출력하고
		// 그렇지 않으면 "불합격"을 출력하는 프로그램을 작성
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two scores >>> ");
		int scoreA = input.nextInt();
		int scoreB = input.nextInt();
		
		// 평균(실수형)
		double average = (double)(scoreA + scoreB) /2;
		// → 정수 / 정수 = 정수
		// → 결과 값을 실수 형으로 얻으려면
		//	 실수 / 실수 로 연산되도록 해야한다.
		
		// 조건 A : 각 점수가 40점 이상
		boolean conditionA = (scoreA >= 40) && (scoreB >= 40);
		
		// 조건 B : 두 점수의 평균이 50점 초과
		boolean conditionB = average > 50;
		
		// 합격 조건 : 조건 A 이거나 조건 B
		String result = conditionA || conditionB ? "합격" : "불합격"; 
		
		System.out.println("Score A = " + scoreA);
		System.out.println("Score B = " + scoreB);
		System.out.println("Average = " + average);
		System.out.println("Pass State = " + result);
		
		input.close();
		
	}

}
