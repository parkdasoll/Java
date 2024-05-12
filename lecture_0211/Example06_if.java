package lecture_0211;

public class Example06_if {

	public static void main(String[] args) {
		// 두 정수의 차이를 절대 값으로 출력
		int n1 = 40;
		int n2 = 70;
		
		int abs = n1 - n2;
		
		// 만약 abs 의 값이 음수인 경우 양수로 연산
		if (abs < 0)
			abs *= -1;
			
		System.out.println("|" + n1 + "-" + n2 + "| = " + abs);
		
	}

}
