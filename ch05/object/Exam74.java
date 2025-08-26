package ch05.object;

/**
 * @날짜 : 2025. 8. 25.
 * @작성자: 김현희
 * @설명 : 생성자 중복
 * 
 * 내부에서 디폴트 생성자
 * 내가 생성자 만들면 내것이 우선
 * 생성자가 없으면 디폴트 생성자 불러오지만 생성자 있으면 내것불러옴
 * 객체 만들면 디폴트 생성자도 필요 클래스 만들때는 생성자 두개 만듦(데이터 던지는 생성자1 디폴트생성자1)
 * 
 * 
 */

class AA{
	private int x;
	private int y;

	public AA() {
		x=0;
		y=0;
	}
	
	
	// 생성자
	public AA(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	
	
	public void disp() {
		System.out.println(x + "\t" +y);
	}
}

public class Exam74 {

	public static void main(String[] args) {
		

		AA a = new AA(10,20);
		a.disp();
		
		
		AA b = new AA();
		b.disp();
		
		Test t = new Test();
		Test e = new Test(1, "홍길동", "123", 27, 159f);
		
		
		
		
	}

}
