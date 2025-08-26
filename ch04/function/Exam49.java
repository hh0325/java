package ch04.function;

/**
 * @날짜 : 2025. 8. 21.
 * @작성자: 김현희
 * @설명 : 함수 - call by value 
 */
public class Exam49 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//sub1(10, 22.2f, 'A', "apple");
		sub1(10);
	    sub2(10, 20);
	    System.out.println("good");
	    sub2(5,7);
	    System.out.println("end");
	}

	
	//public static void sub1(int x, float y, char z, String s) {}
	public static void sub1(int x) {   // x=10
		System.out.println(x);
	}
	
	public static void sub2(int a, int b) {  //a=10  5, b=20
		System.out.println("b:"+b);         //20   5
		
		for(int i=0;i<a;i++) {   //a=10  7
			System.out.println("hahahah");   // 10출력
		}
			
	}
	
	
}
