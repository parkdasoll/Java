package lecture_0225;

// 학생의 정보를 저장하기 위한 클래스
// 필드
//	- 이름
//	- 국어점수
//	- 영어점수
//	- 수학점수
// 메서드
//	- 국영수의 평균을 반환하는 메서드

class Student {
	String name;
	int korean;
	int english;
	int math;
	
	double average(int korean, int english, int math) {
		return (korean + english + math) / 3.0;
	}
}

public class Example03_Student {
	public static void main(String[] args) {
		
		// Student 클래스를 작성한 다음
		// Student 객체를 생성하여 학생의 평균을 
		// 출력하는 프로그램을 작성
		
		Student stu1 = new Student();
		
		double average1 = stu1.average(56, 37, 49);
		System.out.println("Student1's Average = " + average1);
	}
}
