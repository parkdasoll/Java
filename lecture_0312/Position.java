package lecture_0312;

public class Position {
	// 좌표(position)를 표현하기 위한 클래스를 작성
	//		- 필드(private 으로 선언)
	private int x;	// - 100 <= x <= 100
	private int y;	// - 100 <= x <= 100
	
	// 좌표의 범위를 지정하기 위한 변수
	//	모든 인스턴스가 동일한 값을 유지하기 위해
	//	static 멤버로 선언
	final static int MAX = 100;
	final static int MIN = -100;
	
	
	
	//	- 생성자
	//		기본 생성자
	public Position() { 
		this(0, 0);
	}
	
	//		x, y 초기화하는 생성자
	public Position(int x, int y) { 
		// this.x = x;
		// this.y = y;
		setX(x);
		setX(y);
	}
	//	- getter/setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		if(!isValid(x)) x = 0;
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		if(!isValid(y)) y = 0;
		this.y = y;
	}
	
	public boolean isValid(int pos) {
		return pos >= MIN && pos <= MAX;
	}
	
	
	
	public void print() {
		System.out.println("(" + x + ", " + y + ")");
	}
	// 다른 좌표(Position)와의 거리를 반환하는 메서드
	public double getDistance(Position p) {
		int distX = this.x - p.x;
		int distY = this.y - p.y;
			
		double dist = Math.sqrt( Math.pow(distX, 2) + Math.pow(distY, 2) );
			
		return dist;
	}
		
	// 임의의 두 좌표(Position)의 거리를 반환하는 메서드
	public static double getDistance(Position p1, Position p2) {
			
		return p1.getDistance(p2);
	}
		
	//============================================================================
	public double getDistance2(Position p) {
		return getDistance2(this, p);
	}
		
	// 임의의 두 좌표(Position)의 거리를 반환하는 메서드
	public static double getDistance2(Position p1, Position p2) {
		int distX = p1.x - p2.x;
		int distY = p1.y - p2.y;
			
		double dist = Math.sqrt( Math.pow(distX, 2) + Math.pow(distY, 2) );
			
		return dist;
	}
	
	
	
}
