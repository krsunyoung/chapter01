package chapter01;

public class TypeCast {

	public static void main(String[] args) {
	//[ implicity (암시적) type casting ]	
	int i = 10;
	long l = i;
	
	long l2 = 123456789;
	//int i2= l2; byte 큰것이 작은것에 저장 할려고 할때 오류남 내용이 짤려나갈 가능성이 있으므로
	int i2 = (int)l2;
	//위가 가능한 이유는 내용을 알고있으므로 강제로 바뀌는 거라 상관없다고 인식 [ explicity (명시적) type casting ]
	
	System.out.println(i + ":" + l);
	System.out.println(i2 + ":" + l2);
	
	}

}
