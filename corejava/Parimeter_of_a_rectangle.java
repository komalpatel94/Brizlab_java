import java.util.Scanner;
   public class Main{
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the Principal:");
          int Principal=sc.nextInt();
          System.out.println("Enter the rate:");
          int rate=sc.nextInt();
           System.out.println("Enter the time:");
          int time=sc.nextInt();
          int SI = (Principal * rate * time) / 100;
          System.out.println("2. Perimeter of a Rectangle:"+" "+ SI);
}
   }
  
