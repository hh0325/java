package ch08.expection;

/**
 * @날짜 : 2025. 8. 28.
 * @작성자: 김현희
 * @설명 :  예외 처리 - ArithmeticException 
 */

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("x:");
		int x = sc.nextInt();
		
		System.out.print("y:");
		int y = sc.nextInt();
		
		try {
			int div = x/y;                 //float에러발생
			System.out.println("나눗셈:" + div);
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다");
		}
		
		sc.close();
		
		

		
	}
	
	
	
	
}
