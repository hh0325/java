package ch03.array;


import java.util.Scanner;
/**
 * @날짜 : 2025. 8. 22.
 * @작성자: 김현희
 * @설명 : 배열                     //수입력해서 최대값, 최소값 구하기 (비교)
 */
public class Exam40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//배열 입력
		int[] array = new int [5];
		for (int i=0;i<array.length;i++) {
			System.out.println((i+1)+"번째 수 입력");
			array[i] = sc.nextInt(); // 77 88  5 99 3
			
		}
		
		// 최대값 
		int max = array[0]; //5개중 하나뽑아 비교해 나감  
		for(int i=0;i<array.length;i++) {
			if(max < array[i]) { //max 77<88 array[1]
				max=array[i];
			}
		}
		System.out.println("최대값:" + max);
		
		//최소값
		int min=array[0];
		for(int i=0;i <array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		System.out.println("최소값:"+ min);
	
		//배열 선언 방법 

		char[] a = new char[] { 'A', 'B','C'};
		char b []  = new char[3];
		char[] c = {'A','B','C'}; 	
		
		char[] x = new char[] { 'A', 'B', 'C'};  //x = {'A', 'B'}; ERROR
		char y[]=new char[] {'A','B','C'};
		
		char [] i;     //int a; a=10;
		i=new char[] {'A','B'};
		
		char j[]; 
		j=new char[] {'A','B'};
		
		char[] k = null;          // su = {0};
		k=new char[] {'A','B'};
		
	sc.close();
	
	}
	

}










