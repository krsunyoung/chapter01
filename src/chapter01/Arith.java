package chapter01;

public class Arith {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		System.out.println( a + b );
		System.out.println( a - b );
		System.out.println( a / b );
		System.out.println( a * b );
		System.out.println( a % b );
		
		a = a+1;
		System.out.println( a );
		
		a += 1;
		System.out.println( a );
		
		a++;
		System.out.println( a );
		
		++a;
		System.out.println( a );
		
		System.out.println( a++ );
		// System.out.println( a );
		// a++;  두줄을 합친 내용이 위에 내용과 동일
		
		System.out.println( ++a );
		// ++a;
		// System.out.println( a );  두줄을 합친 내용이 위에 내용과 동일
		
		//나누기 연산
		System.out.println( 10 / 3 );
		System.out.println( 10. / 3 );  //.을 붙이면 실수로 인식, 둘중 하나만 해도 인식
		System.out.println( (double)10 / 3 );
		System.out.println( (double)(10 / 3) ); //우선순위가 괄호이므로 그다음에 double로 해서 위아래 차이가 생김
		
		//나머지 연산
		System.out.println( 44 % 3 );
		System.out.println( -7 % 3 );
		System.out.println( 7 % -3 ); //
		
		//관계 연산자 [반드시 boolean 으로 나몽]
		
	}

}
