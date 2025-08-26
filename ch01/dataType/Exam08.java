package ch01.dataType;

/*
 *  6. 논리연산자 : &, |, ^(이진 논리 연산자)
 *               &&, || (일반 논리 연산자)
 */

public class Exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a= 10;
		byte b=2;
		//10 : 0000 1010
		// 2 : 0000 0010
		// & : 0000 0010  >> 2
		// | : 0000 1010   >> 10  한쪽조건이 참이면 참
		// ^ : 0000 1000   >> 8   
		System.out.println("a & b" + (a & b));
		System.out.println("a | b" + (a | b));
		System.out.println("a ^ b" + (a ^ b));
		
		// 여자 : 2, 4, 6
		// 남자 : 1, 3, 5
		
		int x=15;
		boolean y=x>10 && x<20;   // 15>10 1 && 1 15<20
		boolean z=x==10 || x==15;  // 15==10 0 || 1 15==15
		
		System.out.println("x && x" + y);
		System.out.println("x || x" + z);
		
		
		
	}

}
