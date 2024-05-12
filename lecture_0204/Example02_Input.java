package lecture_0204;

import java.util.Scanner;

public class Example02_Input {
	public static void main(String[] args) {
		// 사각형의 넓이를 출력하는 프로그램을 작성
		// 사각형의 너비와 높이를 입력을 받아서 넓이를 구하여 출력
		// 너비, 높이, 넓이를 모두 출력
		
		Scanner input = new Scanner(System.in);
		
		// 사각형의 너비
		System.out.print("Enter width of rectangle : ");
		int width = input.nextInt();
		
		// 사각형의 높이
		System.out.print("enter height of rectangle : ");
		int height = input.nextInt();
		
		// 사각형의 넓이
		int area = width * height;
		
		System.out.println("Width = " + width);
		System.out.println("Height = " + height);
		System.out.println("Area = " + area);
		
		
		input.close();
	}
}
