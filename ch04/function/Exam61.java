package ch04.function;

/**
 * @날짜 : 2025. 8. 22.
 * @작성자: 김현희
 * @설명 : final 상수  / 지역, static
 */
public class Exam61 {
		public static final int VALUE = 99; 
	public static void main(String[] args) {
	
  

		final int SU = 77;
		//SU = 88;   ERROR
		//VALUE=99;   ERROR
		System.out.println(SU);
		System.out.println(VALUE);
	
		
	}

	
	public final void aa() {  }
	public static final void bb() {  }
	public void cc() { }
	
    
	
}
