package ch06.inheritance;

/**
 * @날짜 : 2025. 8. 26.
 * @작성자: 김현희
 * @설명 : 상속
 * 
 *   반강제 - 추상클래스
 *   강제 - 오버라이딩 재정의
 *   선택- 상속
 * 티비기능
 * 
 * 
 */

class TV{
	protected boolean power;  //전원상태
	protected int channel;    //채널
	
	public void power(boolean power) {
		this.power = power;
	}
	
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
	
}

class CaptionTV extends TV{
	private boolean caption;
	
	public CaptionTV() {}
	
	public CaptionTV(boolean power, int channel, boolean caption) {
		super.power = power;
		super.channel = channel;
		this.caption = caption;
	}
	
	public void display(String text) {
		if (power && caption) {
			System.out.println(channel + "\t" + text);
			
		}else {
			System.out.println("power 또는 caption을 켜세요");
		}
	}
	
}

public class Exam84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CaptionTV ct = new CaptionTV (true, 10 ,true);
		ct.channelUp();
		ct.display("캡션을 보여줍니다");
		
		CaptionTV cta = new CaptionTV(true, 10,false);
		cta.channelDown();
		cta.display("캡션을 보여줍니다");
		
		
		
		
	}

}
