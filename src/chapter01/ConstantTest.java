package chapter01;

public class ConstantTest {
	public static void main(String[] args){
		final int CONST_NUMBER = 10;
		final double PI = 3.14;
		//많은 곳에 사용하는 값을 한곳만 변경하면 되서 수월해서 많이 사용한다.
		
		int number = 10;
		System.out.println(number);
		
		number = 20;
		System.out.println(number);
		
		//변수로 값을 변경할수 있지만  상수는 값을 변경 할수 없다. 상수는 대문자로 해주는것이 관례  
		
		System.out.println(CONST_NUMBER);

		
	}
}
