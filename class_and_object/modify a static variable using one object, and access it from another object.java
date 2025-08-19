package Classes;

public class Test {
	static int value=10;

	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test();
		t1.value=20;
		System.out.println("from t2"+ "-" +t2.value);
		

	}

}
