package ch04.function;

/**
 * @날짜 : 2025. 8. 22.
 * @작성자: 김현희
 * @설명 : 변수종류  
 *         - 지역변수 : 블럭 단위 변수 선언
 *         - 매개변수 : 함수 통해
 *         - static 변수 : 프로그램 시작 ~~ 끝 종료
 *         - final 상수  
 *           
 *         변수는 치환가능  
 */
public class Exam59 { 
	
	
	public static int su = 50;      //프로그램 시작해서 종료할떄 까지 사용
	
	
	public static void main(String[] args) {
		

		int x = 10;
		int y = 20;  //지역변수
		
		{
			int z =30;
			
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			System.out.println(su);
			System.out.println();
			
		}
		x= 77;
		su = 88;
		
		System.out.println(x);
		System.out.println(y);
		//System.out.println(z);   //ERROR
		System.out.println(su);
		
		
	sub(x,y);
	
	}

	public static void sub(int x, int y) { // 매개변수(지역변수 의미)
		System.out.println();
		System.out.println(x);
		System.out.println(y);
		System.out.println(su);
		
	}
	
	
	
}
