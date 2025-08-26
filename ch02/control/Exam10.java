package ch02.control;

/**
 * @날짜 : 2025. 8. 22.
 * @작성자: 김현희
 * @설명 : 제어문 - 조건문(if 문)
 */
public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		if (x > 10) // 실행할 문장이 하나 밖에 없다면 중괄호 생략가능, 가독성을 위해 생략 안하는게 좋음
			System.out.println("10보다 큰 수입니다");
		System.out.println();

		int y = 10;
		if (y > 0 && y < 100) {
			y += 200;
			System.out.println("y:" + y);

		}

	}

}
