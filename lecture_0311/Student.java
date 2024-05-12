package lecture_0311;

public class Student {
	// 필드(멤버 변수)	- 모든 필드 private 으로 선언
	// - 이름		이름이 없는 경우 "Unknown"
	// - 국어 점수	0 ~ 100 점 / 그 외인 경우 0
	// - 영어 점수	0 ~ 100 점 / 그 외인 경우 0	
	// - 수학 점수	0 ~ 100 점 / 그 외인 경우 0
	// - 평균
	private String name;
	private int kor;
	private int eng;
	private int math;
	private double avg;
	//==================================================================
	// 생성자
	// - 기본 생성자
	public Student() {this(null, 0, 0, 0);}
	
	// - 이름만 초기화하는 생성자
	public Student(String name) {this(name, 0, 0, 0);}
	
	// - 모든 필드 초기화하는 생성자
	//		(평균은 생성자 내에서 연산)
	public Student(String name, int kor, int eng, int math) {
		setName(name);
		setKor(kor);
		setEng(eng);
		setMath(math);
		// 점수를 설정하는 메서드 내에서
		// 평균을 설정하는 메서드를 호출하기 때문에
		// setAvg() 메서드를 호출하지 않아도 된다.
	}
	
	//==================================================================
	// Getter/Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null || name.isEmpty())
			name = "Unknoun";
		
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(kor < 0 || kor > 100) kor = 0;
		this.kor = kor;
		
		// 국어점수가 수정됐기 때문에
		// 평균도 갱신될 수 있도록 설정
		setAvg();
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		if(eng < 0 || eng > 100) eng = 0;
		this.eng = eng;
		
		setAvg();
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		if(math < 0 || math > 100) math = 0;
		this.math = math;
		
		setAvg();
	}
	
	public double getAvg() {
		return avg;
	}
	
	// - 평균은 현 객체의 점수들로 연산된 값이기 때문에
	//   오히려 외부에서 받아오면 오차가 발생할 수 있다.
	// - 클래스 내 메서드에서만 사용되기 때문에
	//   접근 범위를 최소화하기 위해 private 으로 선언
	private void setAvg() {
		this.avg = (kor + eng + math) / 3.0;
	}
	

	//==================================================================
	// 학생의 이름과 평균을 출력하는 메서드
	public void print() {
		System.out.println("Name 	: " + name);
		System.out.println("Average : " + avg);
	}
}



















