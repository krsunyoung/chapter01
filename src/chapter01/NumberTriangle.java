package chapter01;

public class NumberTriangle {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Java NumberTriangle  [N] : N : 정수  ");
			return;
		}
		int count = Integer.parseInt(args[0]);
		// System.out.println( args [0]);

		for (int i = 1; i < count; i++) {
			// System.out.println( i );
			for (int j = 0; j < i; j++) {
				System.out.print(i );
			}
			System.out.println("");  //print("\n") 과 동일
		}
	}

}
