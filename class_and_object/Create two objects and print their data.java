package Classes;

public class Student {
	String name;
	int marks;
 Student(String n, int m){
 name=n;
 marks=m;
 }
	public static void main(String[] args) {
		Student s1=new Student("Komal",20);
		Student s2= new Student("Avni",21);
		System.out.println(s1.name+ "-"+ s1.marks);
		System.out.println(s2.name+ "-"+ s2.marks);

	}

}
