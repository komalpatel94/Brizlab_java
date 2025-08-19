package Classes;

public class StaticBlockDe {
    static int number;

   
    static {
        number = 50;
        System.out.println("Static block executed, number initialized");
    }

    public static void main(String[] args) {
        System.out.println("Value of number: " + number);
    }
}
