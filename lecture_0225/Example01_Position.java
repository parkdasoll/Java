package lecture_0225;

// 좌표(Position)를 표현하기 위한 클래스(설계도)
//	필드(멤버 변수)
//		- x 좌표
//		- y 좌표

class Position {
	int x;	// x 좌표
	int y;	// y 좌표
	
	// 좌표끼리의 거리를 구하기 위한 기능
	//	- 메서드를 호출한 좌표와 메서드에 전달된 좌표의 거리
	double getDistance(Position dest) {
		// 메서드를 호출한 객체의 좌표를 사용할 수 있기 때문에
		// 거리를 구할 대상만 매개변수로 받으면 된다.
		
		int distX = x - dest.x;
		int distY = y - dest.y;
		double dist = Math.sqrt((distX *  distX) + (distY * distY));
		
		return dist;
	}
	
	// 좌표를 출력하는 기능
	void print() {
		// System.out.println("(" + x + "," + y + ")");
		System.out.printf("(%d,%d)\n", x, y);
	}
	
}



public class Example01_Position {
	public static void main(String[] args) {
		// 임의의 두 좌표(Position)의 거리를 구하는 프로그램을 작성
		
		// 첫 번째 좌표
		int x1 = 10;
		int y1 = 20;
		
		// 두 번째 좌표
		int x2 = 20;
		int y2 = 30;
		//-----------------------------------
		
		// 첫 번째 좌표
		Position pos1 = new Position();
		pos1.x = 10;
		pos1.y = 20;
		
		// 두 번째 좌표
		Position pos2 = new Position();
		pos2.x = 20;
		pos2.y = 30;
		
		// 두 좌표 출력
		pos1.print();
		pos2.print();
		
		// 두 좌표의 거리
		//	= ((x 좌표끼리의 차이의 제곱) + (y 좌표끼리의 차이의 제곱))의 제곱근
		int distX = pos1.x - pos2.x;
		int distY = pos1.y - pos2.y;
		
		double dist = Math.sqrt((distX*distX) + (distY*distY));
		
		System.out.println("두 좌표의 거리 : " + dist);
		//-----------------------------------------------------------
		// pos1 좌표에서 pos2 까지의 거리
		double dist2 = pos1.getDistance(pos2);
		System.out.println("두 좌표의 거리 : " + dist2);
		
		Position pos3 = new Position();
		pos3.x = 0;
		pos3.y = 40;
		
		// pos2 좌표에서 pos3 까지의 거리
		double dist3 = pos2.getDistance(pos3);
		System.out.println("pos2 → pos3 : " + dist3);
	}
}

















