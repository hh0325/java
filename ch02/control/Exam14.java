package ch02.control;

/**
 * @날짜 : 2025. 8. 25.
 * @작성자: 김현희
 * @설명 : 제어문 - 조건문 (다중 if ~ else 문) 
 * 
 *  ;;비교 자바스크립트 if문과 동일
 */
public class Exam14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 52;
		int value = 24;
		
		if(num > value) {
			System.out.println("num가 value보다 크다.");
		}else if(num == value) {
			System.out.println("num와 value가 같다.");
			
		}else if(num > value) {
			System.out.println("num가 value보다 작다  \n");
		}
		
		
	}

}
