package ch07.interfaceA;


/**
 * @날짜 : 2025. 8. 27.
 * @작성자: 김현희
 * @설명 : 추상클래스(추상함수) 함수재정의>> 추상클래스 >>인터페이스
 * 
 * 
 * 
 * chatAt - 문자열의 위치
 * 
 * 
 * 
 */

abstract class Animal {
	public abstract void sound();
}

class Dog extends Animal {
	public void aa() {}
	
	@Override
	public void sound() {
		System.out.println("멍멍");

	}

}

class Cat extends Animal {
	public void bb() {}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("야옹");

	}
}

public class Exam96 {

	public static void main(String[] args) {
//Animal a = new Animal();  ERROR

		Dog dog = new Dog();
		Cat cat = new Cat();

kind(dog);
kind(cat);

		
	}
                           //타입
	//public static void kind(Dog dog) {  //함수 중복 }
	                      //타입
	//public static void kind(Cat cat) {}
	
	
	  
	public static void kind(Animal animal) {   //업캐스팅
		//animal.sound();
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;  //DownCasting
			dog.aa();
			dog.sound();
			
		}else if(animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.bb();
			cat.sound();
		}
		
	}

	
	
	
	
}















