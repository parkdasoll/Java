package lecture_0219;

import java.util.Scanner;

public class File01_Loop {
	public static void main(String[] args) {
		//	반복문의 활용
		
		
		int search = 5;
		for(int i = 1; i <= 10; i++) {
			System.out.println("searching...");
			if(search == i) {
				System.out.println("complete!");
				System.out.println("i = " + i);
			}
		}
		System.out.println("---------------------------------------");
		// 반복문의 흐름을 제어하는 제어문
		//	- 반복 수행 도중에 더 이상 수행 할 필요가 없는 경우
		//	  반복문을 종료시키거나
		//	  다음 반복으로 바로 넘어가도록 할 수 있다.
		//	- 종류
		//		break		: 포함한 반복문을 종료하기 위한 제어문
		//		continue	: 수행 중인 반복을 종료하기 위한 제어문
		//					  반복문이 종료되는 것이 아닌 다음 반복으로 바로 넘어간다.
		//						for 문 → '반복 후 작업' 으로 이동
		//						while 문 → '조건식' 으로 이동
		
		
		// break 문
		//	- 가장 가까운 반복문을 종료시키기 위한 제어문
		//	- 더 이상 반복문을 수행하지 않아도 될 때 사용된다.
		//	- 반복문의 조건 검사는 먼저 수행되거나 마지막에 수행되기 때문에
		//	  원하는 흐름으로 작성하는데 한계가 있다.
		//	- break 문을 사용하지 않고 구현은 가능하나
		//	  코드의 가독성과 효율이 떨어지게 된다.
		
		//	입력한 양의 정수의 합을 구하여 출력하는 프로그램을 작성
		//	음수를 입력 받을 때 까지 정수를 입력을 받고
		// 	음수를 입력을 받았을 때 양의 정수들의 합을 출력
		Scanner input = new Scanner(System.in);
		/*
		int total = 0;
		int n = 0;
		
		// while 문의 조건식을 이용하지 않고
		// 블록 내에서 조건을 검사하는 경우 '무한루프'로 사용하는 경우가 많다.
		while (true) {
			// 입력
			System.out.print("Enter an integer >>> ");
			n = input.nextInt();
			
			// 검사
			//	입력된 값이 음수이면 반복문을 더 이상 
			//	수행할 필요가 없기 때문에 종료
			if(n < 0) break;
			
			// 연산
			total += n;
			
		}
		System.out.println("total = " + total);
		*/
		
		
		// continue 문
		//	- 반복문의 남은 코드를 실행하지 않고 다음 반복으로 넘기기 위해 사용

		
		//	입력한 양의 정수의 합을 구하여 출력하는 프로그램을 작성
		//	음수를 입력받으면 정수를 다시 입력받도록 하고
		// 	0 을 입력을 받으면 더 이상 입력받지 않고 양의 정수들의 합을 출력
		/*
		int n = 0;
		int total = 0;
		
		while(true) {
			// 입력
			System.out.print("Enter an integer >>> ");
			n = input.nextInt();
			
			// 검사
			//	n 의 값이 0 이면 반복문을 종료
			if(n == 0) break;
			//	n 의 값이 음수이면 다시 입력받도록 조건식으로 이동
			if(n < 0) {
				System.out.println("You must enter a positive number.");
				continue;
			}
			
			// 연산
			total += n;
		}
		System.out.println("total = " + total);
		*/
		
		// 중첩 반복문
		//	- 반복문 내에 또 다른 반복문을 작성한 형태
		//	- 두 가지 이상의 반복 대상이 있는 경우 사용된다.
		
		// 반의 수가 5반까지 있고,
		// 한 반의 학생이 10명이 있다고 할 때
		// 각 학생의 반과 번호를 출력
		
		// 1반부터 5반까지
		for(int classN = 1; classN <= 5; classN++) {
			System.out.println(classN + "반");
			
			// 각 반의 학생 10명의 번호를 출력
			for(int studentN = 1; studentN <= 10; studentN++) {
				System.out.println("\tstudent number = " + studentN);
			}
		}
		
		
		
	}
}















