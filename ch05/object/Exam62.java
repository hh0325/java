package ch05.object;

/**
 * @날짜 : 2025. 8. 22.
 * @작성자: 김현희
 * @설명 :Su         <행단위로 데이터 가져옴/ db연동>
 */

public class Exam62 {

	public static void main(String[] args) {
	
		Su a = new Su();  //객체 ->클래스에서 만들어짐
		a.x=10;
		a.y=20;
		System.out.println(a.x + "\t" + a.y);
		
		
		Su b = new Su();
		b.x=77;
		b.y=88;
		System.out.println(b.x + "\t" + b.y);
		
		
		Su c= new Su();
		c.x = 1;
		c.y = 2;
		System.out.println(c.x + "\t" + c.y);

		
	
	}

}
