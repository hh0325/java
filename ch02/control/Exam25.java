package ch02.control;

/**
 * @날짜 : 2025. 8. 20.
 * @작성자: 김현희
 * @설명 : 제어문 - 반복문(다중 for) 
 */
public class Exam25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i=1;i<=3; i++) {   // 1/ 2 /3
			for(int j=1;j<=5;j++) { // 12345 / 12345/
				System.out.println(i+ "" + j);
			}
			System.out.println();
		}
		
		System.out.println();
		//A:65 B:66, C:67 ~~~
		//a:97, b:98,~~~
		
		for(char i='A'; i<='Z';i++) {  // A     B
			for(char j=i;j<='Z';j++){  // A~Z   B~Z
				System.out.print(j);
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		char ch='A';
		System.out.println(++ch);
		
		for(char i='A';i<='z';i++) {
			System.out.print(i + ":" + (byte) i);
			
			if(i=='Z') {
				System.out.println();

				
			}
		}
		
		
	}

}











