package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("값을 입력하세요.");
		
		int count = scanner.nextInt();
		int sum = 0 ;
		
		for ( int i = 1 ; i <=count ; i++){
			sum += i ;
		}
		System.out.println( "입력을 더한값은 "+sum );
		scanner.close();
	}

}
