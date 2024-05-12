package lecture_0219;

public class Example03_Loop {
	public static void main(String[] args) {
		
		// 구구단 2 ~ 9 단을 출력하는 프로그램을 작성
		
		// 2단
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// ...
		// 9 * 8 = 72
		// 9 * 9 = 81
		
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
		
		for(int i = 1; i <= 19; i++) {
			for(int j = 2; j <= 19; j++) {
				System.out.printf("%d * %d = %d\t", j, i, j * i);
			}
			System.out.println();
		}
	}
}
