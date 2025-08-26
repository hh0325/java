package ch05.object;

/**
 * @날짜 : 2025. 8. 25.
 * @작성자: 김현희
 * @설명 : 클래스 3대 특정 - Saram 
 *        은닉화(캡슐화), 중복성, 상속성(재정의)
 *        
 *        
 *        접근제한자 public /private beta
 *        
 *        
 *        
 */
public class Exam68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Saram s = new Saram();  //객체는 클래스명의 <소문자>로 Saram -> 객체: saram
		                            // s = > saram
		// . 또는 함수 접근
		 
		s.name = "홍길동";
		s.address = "서울시 강남구 역삼1동";
		s.phoneNumber = "010-1234-5678";
		//s.juminBunho = "12345-1234567";
		s.setJuminBunho("12345-1234567");
		
		
		s.age = 27;
		
		
		
	}

}
