package ch08.expection;

/**
 * @날짜 : 2025. 8. 28.
 * @작성자: 김현희
 * @설명 : 예외처리 - ArrayIndexOutOfBoundsException
 * 
 * 배열처리 예외
 * 
 * 
 * 
 */
public class Ex03 {

	public static void main(String[] args) {  // Run as - RunCofiguration
	/*	if(args.length !=2) {
			System.out.println("실행방법이 틀렸씁니다");
			
		}else {
			String su = args[0];
			String value = args[1];
			
			System.out.println("args[0]:" + su);
			System.out.println("args[0]:" + value);
		
		}*/

		try {
			
			String su = args[0];
			String value=args[1];
			
			System.out.println("args[0]:" +su);
			System.out.println("args[0]:" + value);
			
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열수를 제대로 입력하세요");
		}
		
		
		
		
		
		
		
	}

}
