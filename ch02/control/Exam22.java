package ch02.control;

/**
 * @날짜 : 2025. 8. 20.
 * @작성자: 김현희
 * @설명 : 제어문 - 반복문(for 문) 
 */
public class Exam22 {
	public static void main(String[] ar) {
		for(int i=1; i<=10; i++) {
			System.out.println("How are you?");
		}
			System.out.println();
	
			for(int j=10; j>=1; j--) {
				System.out.println("How are you?");
			}
		System.out.println();	
		
		for(int k=1;k<=10;) {
			System.out.println(k);
		}
		
		System.out.println();
		
		for(int x=1; x<=100; x++) {
			System.out.print(x + "\t");
			if(x%10==0)
				System.out.println();
		}
		System.out.println();
		
		
	
		
	}

	
	
	
}
