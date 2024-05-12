package lecture_0318;

public class Position {
	// 좌표를 표현하는 클래스(Position)를 작성
	//		필드(private 선언)
	private int x;
	private int y;
	//			x		-100 <= x < 100 , 그 외인 경우 0
	//			y		-100 <= x < 100 , 그 외인 경우 0
	final static int MAX = 100;
	final static int MIN = -100;
	// 생성자
	//			기본생성자
	Position() {
		this(0,0);
	}
	//			좌표를 매개변수로 받는 생성자
	Position(int x, int y) {
		setX(x);
		setY(y);
	}
	//		Getter/Setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		if (!validation(x)) x = 0;
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		if (!validation(y)) y = 0;
		this.y = y;
	}
	
	private boolean validation(int p) {
		return p >= MIN && p <= MAX;
	}
	
	//		메서드
	//		좌표를 출력하는 메서드
	public void print() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
