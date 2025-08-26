package ch05.object;

/**
 * @날짜 : 2025. 8. 25.
 * @작성자: 김현희
 * @설명 : this
 */
public class Exam69 {

	public static void main(String[] args) {
		
		MyData myData = new MyData();
		myData.setData(10,5);   //나중에 view 나 data(외부데이터)로 연결
		myData.disp();      
		
		MyData m = new MyData();
		m.setData(1,2);
		m.disp();
		
		
	}

}
