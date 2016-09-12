package chapter01;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[] intArray;
		intArray = new int[5];
		intArray[0] =3;
		intArray[1] =6;
		intArray[2] =9;
		
		int result = 0;
		for(int i =0; i < intArray.length; i++){ // i<=intArray.length 했을때 오류. 
			System.out.println(i +  ": " +intArray[i]);
			result = result + intArray[1];
		}
		System.out.println("result " + result);
		
		//확장 for 위와 같이 <= 같은 오류가 사라짐. 아예 for문 자체에서 도달하면 빠져나올수 아래처럼 쓰임.
		for (int value : intArray){
			System.out.println(value);
			result = result + value;
		}
		System.out.println("result " + result);
	}

}
