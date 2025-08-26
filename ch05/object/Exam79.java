package ch05.object;



class TestH{
	public int x;
	public static int y;
	
	public void aa() {}
	public static void bb() {}

    public void disp() {
    	System.out.println(x);
    	System.out.println(y);
    	
     aa();
     bb();
     
    }
public static void print() {
	
	//System.out.println(x); ERROR
	System.out.println(y);
	
	//aa();  ERROR
	bb(); 

}


}


public class Exam79 {

	
	
	
	public static void main(String[] args) {  // aa()호출 불가 >>static함수가 아니기떄문
		
TestH a = new TestH();
a.x = 10;
TestH.y=20;

a.disp();
TestH.print();

final int VALUE = 20; //final >>개발자를 위함 값이 바뀌지 않기 위함
//VALUE = 55;   //멤버변수로 들어감//치환불가



	}

	public void aa() {}  
	
	
}








