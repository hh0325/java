package ch08.expection;

/**
 * @날짜 : 2025. 8. 28.
 * @작성자: 김현희
 * @설명 :  예외 처리 - NullPointerException 
 * 
 * 데이터 값이 null일떄
 * 
 */
public class Ex04 {

	public static void main(String[] args) {
		
		try {
			
			String data = null;                    //예외발생
			System.out.println(data.toString());
			
		}catch(NullPointerException e) {
			System.out.println("data 값을 넣어주세요");
		}
		
		
		

	}

}
