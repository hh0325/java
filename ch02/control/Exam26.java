package ch02.control;

/**
 * @날짜 : 2025. 8. 20.
 * @작성자: 김현희
 * @설명 : 제어문 - 반복문(다중 for 문) 
 */
public class Exam26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("\t\t\t 구구단");
for(int i=2;i<=9;i++) {
	System.out.print(i + "단" + "\t\t");
}
		System.out.println();
		
		for(int i=1;i<=9;i++) {
			for(int j=2;i<=9;j++) {
				System.out.print(j + "*" + i + "=" + (j*i) + "\t\t");
			}
			System.out.println();
		}
		
		
		
	}

}
