package ch05.object;

/**
 * @날짜 : 2025. 8. 25.
 * @작성자: 김현희
 * @설명 : Exam63 
 */
public class Person { //구현 클래스

	public String name;  //멤버 변수
	public int age;
	public float ki;  
	
	
	
	//a.name-홍길동  a.age=23   a.ki=182.2

	public void disp() { //멤버 함수   a.disp()  b.disp()
		System.out.println(name); //a.name     b.name
		System.out.println(age);  //a.age      b.age
		System.out.println(ki);   //a.ki      b.ki
		System.out.println();
	}
	
	
	
	
}
