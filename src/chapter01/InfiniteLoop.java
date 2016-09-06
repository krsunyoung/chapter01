package chapter01;

public class InfiniteLoop {

	public static void main(String[] args) {
//		for( ; ;) {
//			
//		}
//		while (true){
//			
//		}
//무한루프
		int i = 0;
		int sum = 0;
		
		while (true ) {
//			i++;
//			if( i >1000){
//				break;
//			}
//			sum += i;
// 아래와 동일
		if( i >1000){
			break;
		}
			sum += i;
			i++;
		}
		System.out.println( sum );
		}

}
