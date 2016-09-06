package chapter01;

public class SwitchTest {

	public static void main(String[] args) {
		int days = 0;
		int month = 2;
		
/*		if ( month == 1 || month ==3 || month ==5 || month ==7 || month ==8 
				|| month ==10 || month ==12  ){
			days = 31;
		} else if (month ==2 ){
			days = 28;
		}else if (month ==4 ){
			days = 30;
		}else if (month ==6 ){
			days = 30;
		}else if (month ==9 ){
			days = 30;
		}else if (month ==11 ){
			days = 30;
		}
		
		switch ( month ) {
			case 1 : 
				days = 31 ;
				break;
			case 2 :
				days = 28 ;
				break;
			case 3 :
				days = 31 ;
				break;
			case 4 :
				days = 30 ;
				break;
			default :
				break;
		}*/
		//break를 안쓰면 마지막에 나오는 월이 나온다. 하지만 예외 경인 경우도 있음 아래와 같이 값을 가질 경우 생략할수 있다.
		switch ( month ) {
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :		
				days = 31 ;
				break;
			case 2 :
				days = 28 ;
				break;
			default :
				days = 30 ;
				break;
			
		}
		
		
		System.out.println(month + "월은  " + days + "일 까지 있습니다.");
		

	}

}
