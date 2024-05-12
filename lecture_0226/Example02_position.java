package lecture_0226;



// 좌표(Position) 을 표현하기 위한 클래스
//	- 필드
//		x 좌표
//		y 좌표
//	- 생성자
//		기본 생성자
//		x, y 초기화하는 생성자
//	- 메서드
//		좌표를 출력하는 메서드


public class Example02_position {
	public static void main(String[] args) {
		Position p1 = new Position();
		p1.print();
		
		Position p2 = new Position(10, 40);
		p2.print();
	}
}
