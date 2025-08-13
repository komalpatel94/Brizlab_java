import java.util.Scanner;
   public class Main{
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the temperature in Celsius:");
          int c=sc.nextInt();
          int Fahrenheit = (c* 9/5) + 32;
          System.out.println("Celsius converts it to Fahrenheit :"+" "+Fahrenheit);
     }
   }
