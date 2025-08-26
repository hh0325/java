package ch04.function;

/**
 * @날짜 : 2025. 8. 22.
 * @작성자: 김현희
 * @설명 : 함수 중복 - function Overload(Overloading) 함수 이름은 같지만, 매개변수 타입과 개수가 다름 함수
 *     중복은 동일한 기능을 하는 함수의 이름을 같게함
 * 
 * 
 * 
 */

public class Exam57 {

	public static void main(String[] args) {

		disp("홍길동");
		disp(10);
		disp(24.5f);
		disp('A');
		disp(55, 77);

	}

	public static void disp(String name) {
		System.out.println(name);
	}

	public static void disp(int x) {
		System.out.println(x);
	}

	public static void disp(float y) {
		System.out.println(y);
	}

	public static void disp(char ch) {
		System.out.println(ch);
	}

	public static void disp(int x, int y) {
		System.out.println(x + "\t" + y);
	}

}
