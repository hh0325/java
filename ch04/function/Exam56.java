package ch04.function;

/**
 * @날짜 : 2025. 8. 22.
 * @작성자: 김현희
 * @설명 : 함수 - 배열      //ctrl+/
 */

import java.util.Scanner;
public class Exam56 {

	public static void main(String[] args) {  // 10 20 30 40 50
		
		// 방법1) 값에 1씩 더해 출력
		
//Scanner sc = null;
//
//for(int i=0; i<args.length; i++) {
//	sc = new Scanner(args[i]);
//	int value = sc.nextInt();
//	System.out.println(++value);
//
//}
//
//sc.close();
		
	//방법2)	배열의 합
		
        int hap = 0;
		for(int i=0;i<args.length;i++) {
		
			int x =Integer.parseInt(args[i]);  // 타입변환
	    
			hap += x;
		}
		
		System.out.println(hap);
		
		
	}

}
