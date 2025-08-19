package Classes;

public class Varr {
	public static Varr d;
	int num;
	void setnum(int num) {
		this.num=num;
	}
   public class Main{
	public static void main(String[] args) {
		Varr.d=new Varr();
		d.setnum(66);
		System.out.print(d.num);

	}
   }
}
