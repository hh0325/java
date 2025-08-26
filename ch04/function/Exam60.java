package ch04.function;

/**
 * @날짜 : 2025. 8. 22.
 * @작성자: 김현희
 * @설명 :  static 변수         [count 변수 없어지지 않고 계속 증가하도록]
 */

public class Exam60 {

	public static int count=0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
sub(10);
sub(20);
sub(30);

	}

	public static void sub(int x) {  // x=10
		
		System.out.println(++count);  //1
		System.out.println(x);        //10
		System.out.println();

	
	
	
	
	}
	
	
	
}
