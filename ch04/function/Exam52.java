package ch04.function;

/**
 * @날짜 : 2025. 8. 22.
 * @작성자: 김현희
 * @설명 : 함수 - call by value       // <이름/점수 입력해서 총점/평균 구하기>
 */
public class Exam52 {

	public static void main(String[] args) {

		int a=10; 
		int b=20;
		
		sub(a,b);
		System.out.println();
	}

	public static void sub(int x, int y) {
		System.out.println(x);
		System.out.println(y);
		
		//System.out.println(a);
		
	}
	
	
}
