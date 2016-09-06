package chapter01;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2004;
		
		if ( year % 4 != 0 ){
			System.out.println( "육년이 아닙니다." );
		} else if( year % 100 != 0 ){
			//4로 나누어 떨어지고 100으로 나누어 떨어지지 않으면
			System.out.println( "육년입니다." );
		} else if ( year %100 == 0 ){
			//4로 나누어 떨어지고 100으로 나누어 떨어지고 400으로 나누어 떨어지지 않으면
			System.out.println( "육년이 아닙니다. ");
		} else {
			System.out.println( "육년입니다." );
		}
		
		int value = 10 ;
		if ( value % 2 ==0 ){
			System.out.println("2의 배수 입니다.");
		} else if (value % 3 == 0){
			System.out.println("3의 배수 입니다.");	
		} else if (value % 5 == 0){
			System.out.println("5의 배수 입니다.");
		} else {
			System.out.println("2,3,5의 배수아닙니다.");
		}
		
		
	}

}
