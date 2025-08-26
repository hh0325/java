package ch02.control;

/**
 * @날짜 : 2025. 8. 22.
 * @작성자: 김현희
 * @설명 : 제어문 - 조건문(if 문)
 */

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int score = 93;
		if(score >=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다 \n");
		}
		
		int num = 52;
		int value = 24;
		if(num > value) {
			System.out.println("num가 value보다 크다");
		}
		if(num==value) {
			System.out.println("num와 value가 같다");
		}
		if(num>value) {
			System.out.println("num가 value보다 작다   \n");
		}
		
		int su = 20;
		if(su%2 ==0){
			System.out.println("짝수입니다");
		}
		if(su%2 !=0) {
			System.out.println("홀수입니다");
		}
		
			
	}

}
