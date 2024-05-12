package lecture_0204;

// Scanner 클래스의 경로를 지정
//	→ 해당 파일에서 Scanner 클래스를 사용
import java.util.Scanner;

public class File02_Input {
	public static void main(String[] args) {
		// 입력(Input)
		//	- 프로그램 외부에서 내부로 데이터가 전달되는 과정
		//		→ 키보드, 파일 읽기, 서버에서 데이터를 받는 과정
		//	- 표준 입력 : System.in
		//	- 기본 입력 : System.in.read()
		//			    → 문자 하나씩 읽어들이기 때문에 
		//				  문자열이거나 숫자로 다뤄야할 경우 별도의 과정이 필요
		//	- 기본 입력을 통해 개발자가 원하는 방식의 데이터를
		//	  바로 사용할 수 있도록 도와주는 클래스
		//		→ Scanner 클래스
		
		// Scanner 클래스를 이용하여 입력 받기
		//	1. Scanner 클래스를 통해서 Scanner 객체(데이터)를 생성
		// 	2. Scanner 클래스를 import 작업
		// 		→ ctrl + shift + o
		// 	3. Scanner 객체를 통해 입력
		//		→ input.next()			:공백을 구분으로 문자열을 입력	= 한 단어
		//		→ input.nextLine()		: 공백을 포함한 문자열을 입력	= 한 문장
		//		→ input.next자료형()		: 공백을 구분으로 자료형 타입의 데이터를 입력
		//	4. 입력된 값을 유지하기 위해서 변수에 저장
		Scanner input = new Scanner( System.in );
		
		// next() 메서드
		//	입력된 값 중 공백을 구분으로 문자열로 읽어들인다.
		String str1 = input.next();
		// "Hello World!" 을 입력받아서 공백을 구분으로 "Hello" 부분을 잘라서 반환
		// Scanner 객체에는 "World!" 만 남는다.
		System.out.println("entered string : " + str1);
		
		// Scanner 객체 내에 입력된 값을 저장하는 변수가 있다.
		// 변수에 저장된 값이 없으면 System.in 을 통해 입력을 받고
		// 변수에 저장된 값이 있으면 저장된 값을 잘라서 요구한 타입으로 반환
		String str2 = input.next();
		// Scanner 객체에는 "World!" 가 남아있기 때문에
		// 입력을 받지 않고 "World!" 를 반환한다.
		System.out.println("entered string : " + str2);
		
		// nextLine() 메서드
		//	입력된 값을 개행문자(\n)를 구분으로 문자열을 반환
		//	※ 다른 입력 메서드를 통해 입력을 받아 반환받을 때
		//	   개행 문자를 그대로 남겨두기 때문에 저장소에 남아있다.
		
		input.nextLine();	// 개행 문자 제거용으로 한 번 호출
		
		String str3 = input.nextLine();
		// Scanner 객체에는 개행문자(\n)가 아직 남아있기 때문에
		// nextLine() 메서드는 이 개행문자를 읽어들인다.
		
		System.out.println("entered string : " + str3);
		
		// 정수형 데이터를 입력
		int n1 = input.nextInt();
		System.out.println("entered integer : " + n1);
		
		// 실수형 데이터를 입력
		double f1 = input.nextDouble();
		System.out.println("entered floating-point : " + f1);
		
		input.close();
		// 입력 스트림을 해제
		// 해제된 이후에는 입력을 받을 수 없다.
	}
}

















