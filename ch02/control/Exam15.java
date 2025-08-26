package ch02.control;

/**
 * @날짜 : 2025. 8. 25.
 * @작성자: 김현희
 * @설명 : 제어문 - 조건문(다중 if~else문) 
 * 
 * 등급 마지막은 else-조건 없을때 나머지
 * 
 */
public class Exam15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 93;
		
		if(score >=90) {
			System.out.println("점수가 100~90 입니다");
			System.out.println("등급은 A 입니다  \n");
		}else if(score >=80) {
			System.out.println("점수가 89~80 입니다");
			System.out.println("등급은 B 입니다 \n");
		} else if(score>=70) {
			System.out.println("점수가 79~70입니다");
			System.out.println("등급은 C 입니다 \n");
		}else {
			System.out.println("점수가 70미만입니다");
			System.out.println("등급은 D입니다 \n");
		}
		
		
		
		
	}

}
