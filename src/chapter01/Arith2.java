package chapter01;

public class Arith2 {

	public static void main(String[] args) {
		int a = 7 ;
		int b = 3 ;
		
		System.out.println( a == b ); // 순환문에서 많이 사용
		System.out.println( a != b );
		System.out.println( a < b );
		System.out.println( a > b );
		System.out.println( a <= b );
		System.out.println( a >= b );
		
		System.out.println( a == b && a > b );
		System.out.println( a != b && a > b );
		
		System.out.println( a == b || a > b );
		System.out.println( a != b || a > b );
		
		System.out.println( ( a + 1 * b++ > 10 ) && ( b++ * 10 - 3 > 10 ) );

	}

}
