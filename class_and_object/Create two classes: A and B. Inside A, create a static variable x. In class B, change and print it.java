package Classes;

public class A {
	static int x=10;
}
class B{
	void change() {
		A.x=50;
		System.out.println("x"+A.x);
	}
	
  public class Main{
	public static void main(String[] args) {
		
  new B().change();
	}

}}
