package lecture_0204;

public class File01_Output {

	public static void main(String[] args) {
		// 출력(output)
		//	- 프로그램 내부에서 외부로 데이터가 전달되는 과정
		// 		→ 모니터, 파일 저장, 서버에 데이터를 전달
		//	- 표준 출력 : System.out	→ 모니터
		//	- 기본 출력 : System.out.println();
		
		// 	- 그 외 출력 방법
		//		System.out.printf(서식 지정자를 포함한 문자열, 서식 지정자에 대입할 값들...)
		//		System.out.print(출력할 데이터)

		int n1 = 10, n2 = 20, n3 = 30, n4 = 40;
		System.out.println("n1 = " + n1 + ", n2 = " + n2 + ", n3 = " + n3 + ", n4 + " + n4);
		
		// 출력할 문자열 내에 데이터를 삽입시키는 방식
		// 데이터가 들어갈 자리를 지정하는 문자 = 서식 지정자
		System.out.printf("n1 = %d, n2 = %d, n3 = %d, n4 + %d\n", n1, n2, n3, n4);
		// → 출력될 문자열의 형식을 바로 알 수 있다.
		// → 하나의 문자열로 표현되기 때문에 변수에 저장하면 재사용이 가능하다.
		
		String format = "n1 = %+d, n2 = %d, n3 = %d, n4 + %d\n";
		System.out.printf(format, -40, 30, 20, 10);
		
		// 서식 지정자의 구조
		// %[플래그][길이][.정밀도][타입]
		
		// 길이 	: 문자열의 최소 길이
		//		: 대입될 데이터의 길이가 최소 길이보다 작은 경우 
		//		  오른쪽에 정렬된다.
		
		// 서식 지정자의 종류(타입)
		// %d : 정수(10진수, decimal)
		// %x : 정수(16진수, hexa decimal)
		// %o : 정수(8진수, octal)
		// %f : 실수(floating-point)
		// %c : 문자(character)
		// %s : 문자열(string)
		
		// 서식 지정자의 플래그
		//	- : 왼쪽 정렬
		//	0 : 빈 공간을 0 으로 채운다.
		//	+ : 양수일 때 '+' 부로, 음수일 때 '-' 부호
		
		int hour = 3, minute = 3, second = 5;
		// System.out.println(hour+" : " + minute + " : " + second );
		System.out.printf("%-2d : %-2d : %-2d\n", hour, minute, second);
		
		hour = 11;
		minute = 5;
		second = 0;
		// System.out.println(hour+" : " + minute + " : " + second );
		System.out.printf("%02d : %02d : %02d\n", hour, minute, second);
		
		double pi = 3.141592;
		System.out.printf("%f\n", pi);
		System.out.printf("%.3f\n", pi); // 소수 세째자리까지 출력
		System.out.printf("%010.3f\n", pi); // 소수 세째자리까지 출력
		
		
		// String 클래스의 format 메서드
		//	- 서식 지정자를 이용하여 문자열을 생성
		//	String.format(서식지정자를 포함한 문자열, 서식 지정자에 대입될 데이터..);
		String time = String.format("%02d : %02d : %02d\n", hour, minute, second);
		System.out.print(time);
	}

}
























