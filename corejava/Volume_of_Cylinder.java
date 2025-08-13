import java.util.Scanner;
   public class Main{
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the radius:");
          double radius=sc.nextInt();
          System.out.println("Enter the height:");
          double height=sc.nextInt();
          double Volume = (3.14 * (radius*radius) * height);
          System.out.println("Area of circle:"+" "+Volume);
}
   }
