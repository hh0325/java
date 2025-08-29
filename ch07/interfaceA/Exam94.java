package ch07.interfaceA;

/**
 * @날짜 : 2025. 8. 27.
 * @작성자: 김현희
 * @설명 : interface
 *       - 내부적으로 public static final 상수, public abstract 함수로 구성
 *          
 * 
 * 
 * 
 *        상속
 *  class -> interface  implements
 *  class -> class     extends
 *  interface -> interface  extends
 * >> 같으면 extends 다르면 implements  
 * interface -> class 없음
 * 
 * 
 * 
 * 
 * 
 */

interface XX{
	public int SU=20;    // 변수 static final
	
	public void disp();  //함수 추상함수(abstract)
		 
}

class YY implements XX{
 
	protected int x;
	
	
	@Override
	public void disp() {
		System.out.println("Hi");
				
	}
	
	public void output() {
		
	}
	
}


class ZZ extends YY{ }

interface Test extends XX{}

// interface Exam implements YY{} 없음  
 

public class Exam94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


YY y = new YY();
y.disp();
y.output();

XX x = new YY();
x.disp();
// x.output();


	}

}
