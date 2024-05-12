package lecture_0318;

// 좌표를 표현하는 클래스(Position)를 작성
//	필드(private 선언)
//		x		-100 <= x < 100 , 그 외인 경우 0
//		y		-100 <= x < 100 , 그 외인 경우 0
// 생성자
//		기본생성자
//		좌표를 매개변수로 받는 생성자
//	Getter/Setter
//	메서드
//	좌표를 출력하는 메서드

// Position 클래스를 상속받는 NamedPosition 클래스를 작성
// 	필드(private 선언)
//		name	이름이 없는 경우 "No Name"
// 	생성자
//		기본 생성자
//		이름만 매개변수로 받는 생성자
//		이름과 좌표를 매개변수로 받는 생성자
//	Getter/Setter
//	메서드
//		이름과 좌표를 출력하는 메서드




public class Example01_Position {
	public static void main(String[] args) {
		NamedPosition n1 = new NamedPosition();
		n1.print();
		
		NamedPosition n2 = new NamedPosition("PositionA");
		n2.print();

		NamedPosition n3 = new NamedPosition("PositionB", 10, -50);
		n3.print();
		
	}
}




















