package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("소수인지 판단할 숫자 : ");
		
		int divisor = 2;
		boolean isPrime = true;
		int num = scanner.nextInt();
		
		while(divisor < num){

/*			내가 잘못 만든 부분.
 			if(num % divisor == 0){
				isPrime = false;
			}else{
				isPrime = true;
			}
			
			divisor ++;
			
			니가 오류난 이유!
			isPrime = false; 다음에 break; 를 써줘야 오류가 없다.  */
			
			int result = num % divisor;
			if (result == 0){
				//소수가 아님
				isPrime=false;
				break;
				// break를 써주면 6을 썻을 경우 2라는 숫자로 나눠졌을때 바로 빠져나올수 있다.
			}
			divisor ++;
			
		}
		
		if( isPrime ){
			System.out.println("은 소수입니다.");
		} else {
			System.out.println("은 소수가 아닙니다.");
		}

	}

}
