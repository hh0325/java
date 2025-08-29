package ch08.expection;

/**
 * @날짜 : 2025. 8. 28.
 * @작성자: 김현희
 * @설명 : 예외 처리 - NumberFormatException
 * 
 * 
 * 숫자로 변환 할 수 없는값이 인식되었을때 
 * 데이터 타입 확인 / 문자포함, 정수가 아닌수
 *  
 */
public class Ex02 {
  public static void main(String[] args) {
	  String su = "100";
	  String value = "a200";
	  
	  try {
		  int isu = Integer.parseInt(su);
		  int ivalue = Integer.parseInt(value);
		  
		  int result = isu+ivalue;
		  System.out.println("result:" + result);	  
		  
		  
	  } catch(NumberFormatException e) {
		  System.out.println("숫자로 변환할 수 없는 값이 입력되었습니다");
		  
	  }
  
  }
}
