package ch07.interfaceA;


/**
 * @날짜 : 2025. 8. 27.
 * @작성자: 김현희
 * @설명 : 상속 - interface
 *    A 전자에 다양한 스마트폰을 만듭니다. 모델별 스펙은 아래오 같다.
 *    
 *    제품명         전화송/수신       5G&LTE    TV리모컨 기능
 
 *        A           가능            LTE      미탑재   
 *        B           가능             5G         탑재
 *        C           가능             LTE       미탑재
 *
 */  
 



public interface Phone {

	public void callSend();
	public void canData();
	public void tvRemote();
	
	
	
	
	
	
}
