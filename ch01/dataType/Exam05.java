package ch01.dataType;

/*
 * 2.단항연산자 : !(일반부정), ~(이진 또는 비트 부정), +/-
 *              ++/-- (전위형 증감연산자 / 2순위 , 후위형 증감연산자 / 9순위)
 *              (Cast) 또는 (자료형) : 형번환
 */

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kor= 88;
		int eng=94;
		int mat=87;
		int tot=kor+eng+mat;
		float avg=(float) tot / 3;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(tot);
		System.out.println(avg);
		
	}

}
