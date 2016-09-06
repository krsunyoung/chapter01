package chapter01;

public class Gugudan {

	public static void main(String[] args) {
		//print(i + "*"+j+"="+(j*j));
		//print("\t");
		for (int j = 1; j<=9; j++){
			for(int i= 1; i<=9; i++){
				int result = i * j;
				System.out.print( i + "*" + j + "=" + result + "\t");
			}
			System.out.println("");
		}
		

	}

}
