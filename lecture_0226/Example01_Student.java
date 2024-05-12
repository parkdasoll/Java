package lecture_0226;

//학생의 정보를 저장하기 위한 클래스
//필드
//	- 이름
//	- 국어 점수
//	- 영어 점수
//	- 수학 점수
//메서드
//- 국영수의 평균을 반환하는 메서드

public class Example01_Student {
	public static void main(String[] args) {
		
		//Student 클래스를 작성한 다음
		// Student 객체를 생성하여 학생의 평균을 
		// 출력하는 프로그램을 작성
		
		// new 연산자를 통해 객체를 생성하고
		// 생성된 객체의 메모리 주소를 참조변수 std1 에 저장
		Student std1 = new Student();
		
		std1.name = "홍길동";
		std1.kor = 80;
		std1.eng = 89;
		std1.math = 78;
		
		std1.print();
		
		if(std1.getAverage() >= 80) {
			System.out.println("합격입니다!");
		}
		
		std1.kor = 90;
		std1.print();
		
		
	}
}
