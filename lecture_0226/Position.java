package lecture_0226;


public class Position {
	// 필드
	int x;
	int y;
	
	
	// 기본 생성자
	Position() { }
	
	// x, y 좌표를 초기화하기 위한 생성자
	Position(int argX, int argY) {
		x = argX;
		y = argY;
	}
	
	void print() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
