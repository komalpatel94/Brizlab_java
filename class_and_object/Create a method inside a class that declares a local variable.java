// Create a method inside a class that declares a local variable. 
//Try printing it outside the method. What happens?
package Classes;

public class ques_1 {
	private static ques_1 d;

	void show() {
		int x=10;
		System.out.print("inside method" + x);
	}


	public static void main(String[] args) {
ques_1.d=new ques_1();
d.show();

	}

}
