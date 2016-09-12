package chapter01;

public class ArrayEquals {

	public static void main(String[] args) {
		int[] a1 ={ 10,20,30};
		int[] b1 ={10,20,30};
		int[] c1 = null;
		
		boolean result = equals (a1, b1);
		System.out.println(result);

	}
	public static boolean equals ( int[] a , int[] b ) {
		if( a == null ){
			return false;
		}
		if(b == null){
			return false;
		}
		
		if (a.length != b.length ){
			return false;
		}
		int length = a.length;
		
		for(int i = 0; i <length ; i++){
			if(a[i]  != b[i]){
				return false;
			}
		}
		return true;
	}

}
