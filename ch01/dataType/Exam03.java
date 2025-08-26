package ch01.dataType;

/*
 * 2. 단항연산자 : !(일반부정), ~(이진 또는 비트 부정), +/-
 *              ++/-- (전위형 증감연산자 / 2순위 , 후위형 증감연산자 / 9순위)
 *              
 */

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int x=10;
		x++; // 11 후위형 증감연산자
		++x; // 12 전위형 증감연산자
		
    System.out.println(x);
    
    --x; // 11 전위형 증감연산자
    x--; // 10 후의형 증감연산자
 
    System.out.println(x);
    System.out.println();
    
       int y = 10;
       int z = ++y; // y=11,z=11
     // int z = y++; // y=11,z=10
      System.out.println("y:" + y);
      System.out.println("z:" + z);
		
		int a = 10;
		int b=20;
		//int c= a++ + b++; //30
		//int c=++a + ++b;    //32
		int c = a++ + ++b;  //31
		System.out.println(c);
		

		
		
		
		
		
		
		
		
		
	}

}
