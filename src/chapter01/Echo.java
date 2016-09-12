package chapter01;

public class Echo {

	public static void main(String[] args) {
		System.out.println( args.length );
		//배열이 0이므로 아래 for문 roop를 타지 않는다. 
		for ( String s : args ){
			System.out.println( s );
		}

	}

}
