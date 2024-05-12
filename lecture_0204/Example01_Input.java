package lecture_0204;

import java.util.Scanner;

public class Example01_Input {
	public static void main(String[] args) {
		// 사용자로부터 사용자의 이름과 나이를 입력을 받아서
		// 사용자의 이름, 나이, 10년 뒤의 나이를 출력하는 프로그램을 작성
		
		// 입력 : 사용자가 프로그램을 통해 입력을 받는 것을 의미
		//	   : 개발자가 코드에 값을 작성하는 것이 아니다.
		
		// 입력을 받기 위해 Scanner 클래스의 객체를 생성
		Scanner input = new Scanner(System.in);
		
		// 사용자로부터 이름을 입력을 받기 위해
		// 안내 문구부터 출력
		System.out.print("Enter your name >>> ");
		// String name = "박다솔";
		String name = input.nextLine();
		
		// 사용자로부터 나이를 입력 받기 위해
		// 안내 문구를 출력
		System.out.print("Enter your age >>> ");
		int age = input.nextInt();
		
		//sysout + 자동완성(ctrl + space)
		System.out.println("Name : " + name);
		System.out.println("Age  : " + age);
		System.out.println("Age after 10 year : " + (age + 10) );
		
		
		input.close();
		
	}
}
