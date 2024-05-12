package lecture_0212;

public class three_six_nine {
	public static void main(String[] args) {
		
		
		for(int i = 1; i < 100; i++ ) {
			
			// 일의 자리
			int firstDigit = i % 10;
			
			// 십의 자리
			int secondDigit = i / 10;
			
			// 일의 자리 검사
			boolean firstMultiple = (firstDigit > 0 && firstDigit % 3 == 0);
			
			// 십의 자리 검사
			boolean secondMultiple = (secondDigit > 0 && secondDigit % 3 == 0);
			
			if(firstMultiple && secondMultiple) {
				System.out.println("박수 짝! 짝!");
			} else if (firstMultiple || secondMultiple) {
				System.out.println("박수 짝!");
			} else {
				System.out.println(i);
			}
			
		};
		
		
		
		

		
		
	}
}
