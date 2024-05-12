package lecture_0311;


public class File01_Array {
	public static void main(String[] args) {
		// 배열(Array)
		//	- 같은 타입의 여러 변수들의 묶음
		//	- 공통된 특징이나 용도가 같은 데이터들을 하나의 식별자로 다룬다.
		// 	- 배열 내에 데이터를 저장하기 위한 각 원소(item)에
		//    접근하기 위해 인덱스(index) 를 이용
	
		
		// 점수 10개를 저장하는 배열
		int[] scores = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		// - 배열 또한 new 연산자에 의해 만들어진 데이터
		//   따라서 new 연산자의 결과 값인 "할당된 메모리 주소"를 저장하는 저장 공간이 필요
		//   → 메모리 주소를 저장하기 위한 참조 변수 scores 를 선언
		// - 즉, 참조 변수 scores 는 정수형 저장공긴이 10개인 배열의 주소를 참조하고 있다.
		
		for(int i =0; i < scores.length; i++) {
			System.out.println(">" + scores[i]);
		}
		//---------------------------------------------------------------------
		// 객체 배열(Object Array)
		// - 다수의 객체를 다루기 위한 배열
		// - 일반 배열과 동일한 방식으로 사용
		int n = 0;
		Simple s = new Simple();
		
		// Simple 객체를 10개 저장하기 위한 배열
		//	- 객체 배열을 참조하기 위한 참조 변수를 선언
		//	- new 연산자를 통해 객체 10개를 저장하기 위한 배열을 생성
		//		객체를 다루기 위한 참조 변수 10개를 선언하는 과정과 동일
		// 	- 각 원소에는 Simple 객체의 메모리 주소를 저장한다.
		
		Simple[] simples = new Simple[10];
		
		// 객체 배열을 생성하면 각 원소에는 기본 값인 'null' 로 초기화가 된다.
		// 각 원소마다 Simple 객체를 생성
		for(int i = 0; i < simples.length; i++) {
			simples[i] = new Simple("Simple" + i, i);
		}
		
		// simples				: Simple 객체의 주소 10개를 저장하는 배열의 주소를 저장
		// simples[i]	 		: i 번째 객체의 주소를 저장
		// simples[i].print()	: i 번째 객체의 print() 메서드를 호출
		for(int i = 0; i < simples.length; i++) {
			simples[i].print();
		}
		//-------------------------------------------------------------------
		// 다차원 배열(Multidimensional Array)
		//	- 배열의 배열
		//	- 공통적인 특징 또는 용도를 가진 배열들의 배열
		
		// 1차원 배열
		int[] arr = {1, 2, 3, 4, 5};
		
		// 2차원 배열
		//	= 1차원 배열 * n
		// 	= int[1차원 배열의 개수][1차원 배열의 원소의 수]
		int[][] arr2 = new int[3][5];
		// 1차원 배열의 개수 = 3
		// 1차원 배열의 원소의 수 = 5
		// 정수를 저장할 수 있는 수 = 15
		
		// 3차원 배열
		// = 2차원 배열 * n
		int[][][] arr3 = new int[3][4][5];
		// 2차원 배열의 개수 = 3
		// 2차원 배열의 원소의 개수 = 각 원소의 1차원 배열의 수 = 4
		// 1차원 배열의 원소의 개수 = 5
		
		//-------------------------------------------------------------------
		// 한 고등학교의 학생들을 관리하는 프로그램을 만든다고 가정
		// - 3개의 학년
		// - 6개의 반
		// - 30명의 학생
		// → 총 학생 수 = 540 명
		Student[] students = new Student[540];
		// → 특정 학생을 관리하기가 힘들다.
		// → 몇 반의 몇 번 학생을 지목하기가 힘들다.
		
		Student[][][] students2 = new Student[3][6][30];
		
		// 2학년 5반 15번
		int gradNum = 2;
		int classNum = 5;
		int studentNum = 15;
		students2[gradNum-1][classNum-1][studentNum-1] = null;
		
		// 2학년 학생 → 3학년 학생
		students2[2] = students2[1];
		// 1학년 학생 → 2학년 학생
		students2[1] = students2[0];
		// 새로운 1학년 
		//	- 6개의 반
		//	- 각 반에 30명의 학생
		students2[0] = new Student[6][30];
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
