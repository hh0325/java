package ch05.object;

/**
 * @날짜 : 2025. 8. 26.
 * @작성자: 김현희
 * @설명 : static 변수, static 함수
 *  함수사용 >> 객체 발생안함
 *
 * int x=10;  // stack 영역 >> 들어갔따나왔다를 반복	
 * //stack  /    heap 영역
 * TestG a = new TestG();	
 * 
 * static 함수는 static 변수만 가져다 사용
 * 
 * 
 */

class TestG{  //TestG a = new TestG(...)    
	public String name;
	public int don;
	public static float iyul;    // public이면 영역이 다름 클래스명으로 접근 
	
	public static void  setIyul(float iyul) {  //멤버변수 static >> 객체접근불가
		TestG.iyul = iyul;  //크래스명으로 접근
	
		System.out.println(TestG.iyul);
		
		//System.out.prrintln(name);   ERROR
		
		//aa();   ERROR
		
		
		
	}
	
	public TestG() { } 
	
	public TestG(String name, int don, float iyul) {
		
		this.name = name;
		this.don = don;
		TestG.iyul = iyul;
			
	}
	
     public void disp() {
	 System.out.println(name);
	 System.out.println(don);
	 System.out.println(iyul);

	 
	 aa();
	 
	 
     }
	public void aa() {}
}


public class Exam78 {

	public static void main(String[] args) {
	TestG.setIyul(0.07f);
	
	
	
		TestG a = new TestG("kim", 10000, 0.07f );
    
		a.disp();  
        a.don = 20000;
        TestG.iyul= 22.5f;
		
		
		///api 예시
		double x = Math.PI;
		System.out.println(x);
		
		double y = Math.abs(-22.5);
		System.out.println(y);
		
		String str = new String("apple");
		byte [] b = str.getBytes();
		
		
		
	}

}
