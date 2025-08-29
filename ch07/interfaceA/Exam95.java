package ch07.interfaceA;


/**
 * @날짜 : 2025. 8. 27.
 * @작성자: 김현희
 * @설명 : 멤버변수, 지역변수, 매개변수/리턴
 * 
 *  
 * 
 * << 중요 =>연습하기 객체를 클래스로 받을 때
 *  
 *  한 행 =>클래스 
 *  
 *  
 */
import java.util.Scanner;     //멤버객체

class AA{
	public int x;
	
	public void disp() {
		int y=20;           //지역변수
	}
	
	public void aa(int su) { }  // 
	
	public int bb() {
		int value =20;
		
		
		return value;
		
	}
	
}

class BB{
	public AA a;     //멤버 객체 x, disp(),aa(), bb()	
	public String str;
	public Scanner sc;
	
	public void output() {
		a=new AA();
		a.disp();
		a.aa(10);
		a.bb();
		
	}
	public void apple() {
		//지역객체
		AA a = new AA();
		
		
		       //객체           //생성자(클래스.변수)
		Scanner sc = new Scanner(System.in);  // 생성자 
	}
	
	public void banana(AA a) {}
	
public AA melon() {  // void(x) / AA(O)  객체를 넘김 
	AA a = new AA();
	return a;   //클래스 리턴
}
	
}

// 

public class Exam95 {

public static void main(String[] args) {
	AA a = new AA();
	
	BB b = new BB();
	b.banana(a);
	
	AA aa = b.melon();   // 객체가 넘어가면 클래스가 넘어감
	
	
}
	
}































