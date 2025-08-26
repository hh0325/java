package ch05.object;

/**
 * @날짜 : 2025. 8. 25.
 * @작성자: 김현희
 * @설명 : Exam64  
 */


import java.util.Scanner;  //키보드입력받기

public class Hakjum { // 재사용 +확장

	//속성 - 변수
	//다시 필요할 것 같으면 속성으로 
	
	public String name;
	public int kor;
	public int eng;
	public int mat;
	public int tot;
    public float avg;  
	
	
	// 동작 - 함수
    
    public void input() {
    	
    	Scanner sc = new Scanner(System.in);
    	
    
    	// 변수 -  데이터 전달
    	System.out.println("이름:");   
    	name = sc.next();   // 펭수
    	
    	System.out.println("국어:");
    	kor = sc.nextInt(); //70
    	
    	System.out.println("영어");
    	eng = sc.nextInt(); //80
    	
    	System.out.println("수학");
        mat = sc.nextInt(); //77
    	
    	// sc.close(); 추후 함수로 만든다 =>ERROR
    	
        
    }
    
	public void total() {
		tot = kor + eng + mat;  //속성으로 설정하면 타입안써도 됨

	}

	public void average() {
		avg = (float) tot / 3;
		
	}

	public void disp() {
 System.out.println("이름:" + name);
 System.out.println("국어:" + kor);
 System.out.println("영어:" + eng);
 System.out.println("수학:" + mat);
 System.out.println("총점:" + tot);
 System.out.println("평균:" + avg);
	}

	
	
//학점, 등수....
	
	
}


