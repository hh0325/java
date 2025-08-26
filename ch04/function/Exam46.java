package ch04.function;

/**
 * @날짜 : 2025. 8. 21.
 * @작성자: 김현희
 * @설명 : 함수 - Call by Name
 * 
 *      프로그램은 크게 두가지로 구성 
 *      데이터 : 자료형을 활용해서 변수, 배열
 *      데이터 처리(기능) : 함수
 *      
 *      클래스 : 데이터 + 기능
 *      
 *   main 시작 함수 (콘솔기반) - 컴파일러
 *   
 */
public class Exam46 {

	public static void main(String[] args) {//컴파일러가 호출해주는 함수
		
		// 접근제한자 지정예약어 반환타입 함수명 (매개변수목록)
		 sub();   ///F5/F7
		 System.out.println("hahaha");
		 sub();
		 System.out.println("hohohoh");
		 sub();
		 System.out.println("end!!!");
		 
	}

	public static void sub() {
		 System.out.println("안녕하세요");
		 System.out.println("안녕하세요");
		 System.out.println("안녕하세요");
		 System.out.println("안녕하세요");
		 System.out.println("안녕하세요");
		 System.out.println("안녕하세요");
		 System.out.println("안녕하세요");
		 System.out.println("안녕하세요");
		 
	}
	

	
	
}
