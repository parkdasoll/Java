package lecture_0226;



// 객체를 만들기 위한 클래스( = 설계도)
// → main 메서드를 작성하지 않는다.
// → class 키워드를 통해 클래스를 선언
public class Student {
	// 객체가 가질 속성과 기능을 정의
	//	속성 = 값
	//	기능 = 명령어
	
	// 객체가 가질 속성들을 저장하기 위한 변수
	//	- 필드(field), 멤버 변수(member variable)
	String name;	// 학생의 이름		: 이름이 없는 경우 "No Name"
	int kor;		// 학생의 국어 점수	: 0 <= score <= 100 가 아닌 경우 0
	int eng;		// 학생의 영어 점수	: 0 <= score <= 100 가 아닌 경우 0
	int math;		// 학생의 수학 점수	: 0 <= score <= 100 가 아닌 경우 0
	
	//---------------------------------------------------------------
	// 기본 생성자
	Student() {
		this(null, 0, 0, 0);
	}
	
	// 이름만 받아서 초기화하는 생성자
	Student(String name) {
		this(name, 0, 0, 0);
	}
	
	// 이름과 점수들을 받아서 초기화하는 생성자
	Student(String name, int kor, int eng, int math) {
		if (name == null || name.isEmpty())
			name = "No Name";
		
		// if (0 > kor || kor > 100) kor = 0;
		if(!isValidation(kor)) kor = 0;
		if(!isValidation(eng)) eng = 0;
		if(!isValidation(math)) math = 0;
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 점수의 유효성을 검사하기 위한 메서드
	boolean isValidation(int score) {
		return score >= 0 && score <= 100;
	}
	
	//---------------------------------------------------------------
	
	// 객체가 가질 기능을 정의한 메서드
	// = 메서드(method), 멤버 함수(member function)

	// 학생의 평균을 반환하는 메서드
	double getAverage() {
		// 자신의 국영수 를 가지고 평균을 구하기 때문에
		// 외부에서 받아올 값이 없다.
		
		return (double)(kor + eng + math) / 3;
	}
	
	// 학생의 이름과 평균을 출력하는 메서드
	//  메서드에서는 멤버에 바로 접근이 가능하다.
	void print() {
		System.out.println("이름 : " + name);
		System.out.println("평균 : " + getAverage());
	}
	
}



























