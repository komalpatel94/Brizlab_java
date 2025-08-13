import java.util.Scanner;
   public class Main{
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the radius:");
          double radius=sc.nextInt();
          double Area =  3.14 * (radius * radius);
          System.out.println("Area of circle:"+" "+Area);
}
   }
