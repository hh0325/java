package ch02.control;

/**
 * @날짜 : 2025. 8. 25.
 * @작성자: 김현희
 * @설명 : 제어문-조건문(중첩 if~else문)
 *  
 *  양수 음수 구분/ 양수 -  큰수 작은수 구분
 *  
 */
public class Exam17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 150;

if(num > 0) {
	if(num > 200) {
		System.out.println("200보다 큰 수 입니다");
	}else {
		System.out.println("200보다 작은 수 입니다");
	}
}else {
	System.out.println("음수입니다");
}
		
		
		
		
		
	}

}
