package chapter01;

public class ArrayTest2 {
	
	//객체를 저장하는 배열 VS 기본타입을 저장하는 배열의 차이점
	public static void main(String[] args) {
		Book[] books = new Book[5];
		
		books[0] = new Book();
		books[0].title="자바의 정석";
		/*
		books[0] = new Book(); 없으면 에러  배열도 객체이기때문에 null값이 들어가있음
		book이라는 객체가 만들어지고 레퍼런스 값이 들어가짐. 그리고 나서 값을 넣어줘야 함. 그래야 에러가 안남
		*/
		
		//System.out.println( book[]);

	}

}
