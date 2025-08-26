package ch05.object;

/**
 * @날짜 : 2025. 8. 25.
 * @작성자: 김현희
 * @설명 : Exam66
 * 
 *  
 */
public class Pay {

	public String name;
	public int bonbong;  //왕눈이
	public int tax;      // 20000000
	public int silsu;
	
	//n= 왕눈이 = name , b = 20000000 = bonbong
	public void input(String name, int bonbong){
	 this.name = name;
	 this.bonbong = bonbong;
	 
		
	}
	public void yonsan() {
		tax= (int)(bonbong * 0.045 + 0.5);
		silsu = bonbong-tax;
	}
	
	
	public void output() {   //this 생략가능
		System.out.println("name:" + name);
		System.out.println("bonbong:" + bonbong);
		System.out.println("tax:" + tax);
		System.out.println("silsu:" + silsu);
		System.out.println("silsu:"+ "tax" + "\n");
		
		
	}
	
}

//a.name, a.bonbong, a.tex, a.silsu
//a.input()