package chapter01;

public class ContinueTest {

	public static void main(String[] args) {
//		for( int i = 0; i <= 20; i++){
//			
//			if(i % 2 !=0 && i % 3 != 0){
//				System.out.println( i );
//			}
//			
//		}
// 		위아래 동일 
		
		for(int i = 0 ; i <=20; i++){
			if(i % 2 == 0){
				continue;
			}
			if(i % 3 == 0){
				continue;
			}
		}

	}

}
