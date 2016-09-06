package chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int result = 1;
		System.out.println("승수 : ");
		
		int pow = scanner.nextInt();
		int i = 0;
		
		while(i < pow){
			result = result * 2;
			//result *= 2;
			i++;
			
		}
		System.out.println("2의 "+ pow + "승수는 " + result +"입니다.");

	}

}
