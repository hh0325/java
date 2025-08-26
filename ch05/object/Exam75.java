package ch05.object;

/**
 * 
 * @날짜 : 2025. 8. 25.
 * @작성자: 김현희
 * @설명 : 생성자 호출 
 * 클래스 - 변수/함수/생성자
 * this로 생성자를 호출 할 수 있따 
 * 
 * 2025 0825 배운거
 * 클래스의 접근제한자 public private
 * this/생성자
 * 함수로 데이터 전달
 * 
 * 
 */

class TestY{
	
	private int x,y,z;
	private int a;
	
	public TestY() {   
		x=100;
		y=200;
		z=300;
		a=400;
	}
	
	public TestY(int x) {  //1
//		this.x=x;
//		y=200;
//		z=300;
//		a=400;
	
	this();   //생성자로 호출할떄    // x,y,z,a
	this.x=x;                   //1,y,z,a

	}
	
	public TestY(int x, int y) {  // 1,2
		
		//방법1
//		this.x=x;
//		this.y=y;
//		z=300;
//		a=400;
		
		//방법2
//		this();
//		this.x=x;
//		this.y=y;
		
		//방법3
		this(x); // 1 ...
		this.y=y;// 1,2...
		
		
	}
	
}


public class Exam75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
