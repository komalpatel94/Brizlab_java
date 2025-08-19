import java.util.Scanner;
class Car{
    String model;
    int year;
    static int numberofcars=0;

    Car(String m,int y){
        model=m;
        year=y;
        numberofcars++;
    }
}
public class Main{
public static void main(String [] args){
    Car c1=new Car("honda city",2020);
    Car c2=new Car("swift",2025);
    System.out.println("Total cars" + ":"+ Car.numberofcars);
}
}

