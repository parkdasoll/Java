package lecture_0129;

public class Example01_Variable {

	public static void main(String[] args) {
		// 너비가 8, 높이가 12 인 사각형의 넓이를 구한 다음
		// 너비, 높이, 넓이를 모두 출력
		
		// 너비를 저장하기 위한 변수
		int width = 10;
		
		// 높이를 저장하기 위한 변수
		int height = 12;
		
		// 넓이를 저장하기 위한 변수
		int area = width * height;	// → 8 * 12
		// 연산을 하기 전에 변수가 있으면 변수에 저장된 값을 먼저 불러온다.
		// 불러온 데이터를 연산하여 결과 값을 변수 area 에 저장
		
		System.out.println(width);
		System.out.println(height);
		System.out.println(area);

		System.out.println("-------------------------");
		width = 20;
		// 변수 width 의 값을 다른 값으로 저장하고
		// 이때 넓이를 출력하면 새로운 넓이가 아닌 기존의 넓이가 출력된다.
		//	→ 변수에는 표현식이 아닌 표현식의 결과 값이 저장되기 때문에
		// 	  너비가 다른 값으로 바뀐다고 해서 넓이도 바꾸지는 않는다.
		//	→ 너비 또는 높이가 바뀌면 넓이를 다시 연산하여 구해야한다.
		area = width * height;
		System.out.println(width);
		System.out.println(height);
		System.out.println(area);
		
	} 

}
