package chapter01;

import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("값을 입력하시오"); 
		int count = scanner.nextInt();
		for (int i = 0; i <count; i++){
			System.out.println(count);
		}

		scanner.close();
	}

}
