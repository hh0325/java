package ch05.object;

/**
 * @날짜 : 2025. 8. 25.
 * @작성자: 김현희
 * @설명 : focus = 함수를 통해 데이터 던지고 함수를통해 데이터 추출
 *         get - set 한세트
 *        
 *        this ->
 *        
 *        은닉화 = 클래스밖에서 접근 제한
 *          
 *          
 *          
 *          
 */       
public class Sub {

	public String id;
	public String pwd;
	public int age;
	public String addr;
	public String phone;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
