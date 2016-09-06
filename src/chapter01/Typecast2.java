package chapter01;

public class Typecast2 {

	public static void main(String[] args) {
		byte b;
		int i = 414;
		float f = (float)123.456;
		//float f = 123.456f;  위와 동일
		
		b=(byte)1;
		System.out.println("int 414를  byte로 변환 : " + b);
		i=(int)f;
		System.out.println("float 123.456를 int로 변환 : "+ i);
		b=(byte)f;
		System.out.println("floast 123.456를 byte로 변환 : " + b);
	
	}

}
