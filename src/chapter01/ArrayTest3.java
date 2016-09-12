package chapter01;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		
		int arrayInt2[]; //비추
		// 두가지 방법으로 배열을 생성할수 있음. 
		// int[10] arrayInt3 ;  오류   Student s; 이렇게 해도 오류 C에서는 가능함. 
		
		int[] arrayInt1; //추천
		arrayInt1 = new int[5];
		arrayInt1[0] = 1;
		arrayInt1[1] = 2;
		arrayInt1[2] = 3;
		arrayInt1[3] = 4;
		arrayInt1[4] = 5;
		//위아래 두가지 방법으로 생성. 
		int[] arrayInt4 = { 1,2,3,4,5};
		
		//Book[] books = { new Book(), new Book()};
		
		String[] month = { " Jan " , " Feb ", " Mar ", " Apr ", " May "};
		int[] arrayInt5 = new int[] {10 ,20 , 30 ,40}; //비추
		
		/* error
		int[] arrayInt6;
		arrayInt6 = { 100, 200 , 300 ,400 } ;
		arrayInt에는 null이 저장되어 있으므로 오류
		변수를 선언할때 같이 초기화 시켜줘야 함.
		*/

	}

}
