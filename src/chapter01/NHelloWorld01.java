package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//out은 콘솔 출력  in은 입력받는 값
		System.out.println("값을 입력하시오"); //println \n을 같이 출력하시오 즉 다음줄로 넘기시오
		int count = scanner.nextInt();
		int i = 0;
		while (i < count){
			i++;
		}
		System.out.println(count);
		scanner.close();

	}

}
