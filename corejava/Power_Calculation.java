import java.util.Scanner;
   public class Main{
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the base value:");
          int base=sc.nextInt();
          System.out.println("Enter the exponent value:");
          int exponent=sc.nextInt();
          double power= Math.pow(base,exponent);
          System.out.println("The Power calculation is:"+ power);
}
   }
  
