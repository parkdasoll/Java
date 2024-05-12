package lecture_0311;

public class Example01_student {
	public static void main(String[] args) {
		
		Student std1 = new Student("홍길동");
		std1.print();
		
		std1.setKor(90);
		std1.setEng(80);
		std1.setMath(83);
		std1.print();
		
		std1.setEng(171);
		std1.print();
		
	
		
		
	}
}
