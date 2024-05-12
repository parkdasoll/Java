package lecture_0312;



// 상속(Inheritance)
//	- 기존의 클래스를 이용하여 새로운 클래스를 만들기 위한 특성
//	- 기존 클래스의 멤버를 새로운 클래스에 상속시킨다.
//	- 새로운 클래스가 기존 클래스만큼 '확장(extend)'되는 개념 

class SuperClass {
	// private 으로 선언된 멤버는
	// 선언된 클래스에서만 접근이 가능하기 때문에
	// 서브 클래스에서도 접근이 되지 않는다.
	private int superData;
	
	void superPrint() {
		System.out.println("super data = " + superData);
	}
	
	public int getSuperData() {
		return superData;
	}
	
	public void setSuperData(int superData) {
		this.superData = superData;
	}
	
}

// 서브 클래스가 슈퍼 클래스만큼 확장된다.
// 슈퍼 클래스에 정의된 멤버를 모두 사용할 수 있다.
class SubClass extends SuperClass{
	int subData;
	
	void subPrint() {
		// 서브 클래스 내에서 슈퍼 클래스의 멤버를 사용할 수 있다.
		// 	- 자신의 멤버인 것 처럼 사용할 수 있다.
		//  - 단, 접근이 제한되는 경우에는 사용할 수 없다.
		//	  접근만 제한된다. 
		System.out.println("super data = " + getSuperData());
		System.out.println("sub data = " + subData);
	}
}



public class File02_Inheritance {
	public static void main(String[] args) {
		Simple s1 = new Simple();
		Position p1 = new Position();
		//------------------------------------
		
		SuperClass sup = new SuperClass();
		
		// sup.superData = 100;
		// sup.subData = 200;
		// → 슈퍼 클래스의 인스턴스는 자신을 상속한 서브 클래스의 멤버에
		//	 접근할 수 없다.
		
		sup.setSuperData(200);
		sup.superPrint();
		
		SubClass sub = new SubClass();
		// sub.superData = 300;
		sub.setSuperData(300);
		sub.subData = 400;
		sub.superPrint();
		sub.subPrint();
		
	}
}
