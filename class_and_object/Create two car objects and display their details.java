import java.util.Scanner;
class Car{
    String model;
    int year;
}
public class Main{
public  static void main(String[] args){
Car c1=new Car();
c1.model="honda city";
c1.year=2034;
Car c2=new Car();
c2.model="swift";
c2.year=2025;
System.out.println(c1.model + "-" + c1.year);
System.out.println(c2.model + "-" + c2.year);
}
}
