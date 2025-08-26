package ch06.inheritance;

/**
 * @날짜 : 2025. 8. 26.
 * @작성자: 김현희
 * @설명 : 상속
 * 
 * 
 * 
 * 
 */

class AParents {
	protected int x, y;
}

class ASon extends AParents { // x,y,a,b,disp()
	private int a, b;

	public void input(int x, int y, int a, int b) {
		super.x = x;
		super.y = y;
		this.a = a;
		this.b = b;

	}

	public void disp() {
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x); // 부모변수 구분한다.
		System.out.println();

		System.out.println(y);
		System.out.println(this.y);
		System.out.println(super.y);
		System.out.println();
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println();
		
		
		System.out.println(b);
		System.out.println(this.b);

		
	}
}

public class Exam82 {

	public static void main(String[] args) {
		ASon b = new ASon();  //생성자 찾아감 -> 상속받음 ->생성자 찾아감->없으면 디폴트 생성자
		b.input(10,20,30,40); 
		b.disp();
		
		
		
		
	}

}
