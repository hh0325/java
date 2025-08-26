package ch04.function;

public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char x = outChar();
		System.out.println(x);
		
		
int y = outDec();
System.out.println(y);
		

float z = outFloat();
System.out.println(z);

	}

	public static char outChar() {
		return 'A';
	}
	
	
	public static int outDec() {
		return 32767;
	}

	public static float outFloat() {
		return 98.54f;
	}
	
	
	
}
