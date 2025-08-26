package ch05.object;

public class MyData {         //  this = myData  / this = m
                                 
	private int x;  //10      //  this.x == myData.x  m.x  
	private int y;  //5       //  this.y == myData.y  m.y

		
	//this.setData(int x, int y) ==myData.setData()
	
	public void setData(int x, int y) { //x=10, y=5
		
		this.x=x;  
		this.y=y; 
		
		System.out.println(x + "\t" + y);
		System.out.println(this.x + "\t" + this.y);
		
		
	}
	
	//this.disp() == myData
	public void disp() {
		System.out.println(x + "\t" + y);	//this 생략가능	
	
	}
	
	public void aa() {
		this.disp();
	} // x,y
	
	public void bb() { } // x,y
	public void cc() { } // x,y
}
