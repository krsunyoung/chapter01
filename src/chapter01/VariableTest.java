package chapter01;

public class VariableTest {

	public static void main(String[] args) {
		// 아래는 지역변수로 값을 꼭!!!!! 초기화 시켜줘야 한다.
		byte b = 20;
		short s = 100;
		int i = 10;
		long l = 90;
		float f = 3.14f;
		//3.14를 입력하면 double로 인식을 해서 오류를 하므로 작은 값이라는 것을 인식시켜준다.
		double d = 3.14;
		boolean bool = true;
		char c = 'A';
		//같은 함수 안에서 변수를 만들어줄때 중복되면 오류 된다.
		
		String str = "Hello World ";
		
		System.out.println( b );
		System.out.println( s );
		System.out.println( i );
		System.out.println( l );
		System.out.println( f );
		System.out.println( d );
		System.out.println( bool );
		System.out.println( str );
		System.out.println( c );
		
		//레퍼런스 형(참조형) 무조건 new 로..
		Circle circle = new Circle();
		circle.radius = 5;
		circle.area = 5 * 5 *3.14;
		
		System.out.println(circle.area);
		
		String str1 = new String("Hello World");
		System.out.println(str1);
		
		String str2 = "Hello World";
		System.out.println(str2);
		//내부적으로 위와 같이 바뀐다. string을 많이 쓰기때문에 아래와 같이 해도 오류가 나지 않는다.
		
		
		//character 형
		char ch1 = '1';
		char ch2 = 49;
		char ch3 = 1;
		//숫자와 문자의 차이 ? 숫자는 00000001 이지만 문자 1은  49(00110001)의 값을 갖는다.
		//숫자 1의 ASK코드 값이 NULL값이므로 값이 깨진듯이 나옴.
		
		System.out.println( ch1  + ":" + ch2 + ":"+ch3);
		
		
	}

}
