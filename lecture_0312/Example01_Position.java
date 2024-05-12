package lecture_0312;

// 좌표(position)를 표현하기 위한 클래스를 작성
//	- 필드(private 으로 선언)
//		x
//		y
//	- 생성자
//		기본 생성자
//		x, y
//	- getter/setter
//	- 메서드
//		좌표를 출력하는 메서드
//		다른 좌표와의 거리를 반환하는 인스턴스 메서드
//		두 좌표의 거리를 반환하는 static 메서드

public class Example01_Position {
	public static void main(String[] args) {
		Position p1 = new Position(10, 50);
		Position p2 = new Position(30, 25);
		
		double dist1 = p1.getDistance(p2);
		System.out.println("dist1 = " + dist1);
		
		Position p3 = new Position(50, 60);
		double dist2 = Position.getDistance(p1, p3);
		System.out.println("dist2 = " + dist2);
	}
}
