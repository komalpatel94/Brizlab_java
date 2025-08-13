import java.util.Scanner;
   public class Main{
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the kilometer:");
          int km=sc.nextInt();
          double Miles = km * 0.621371;
          System.out.println("The Conversion of Kilometers to Miles:"+ Miles);
}
   }
