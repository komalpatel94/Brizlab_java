package Classes;

public class StaticVarDemo {
    static int num;  

    public static void main(String[] args) {
        System.out.println("Default value of num: " + num);
        num = 100;
        System.out.println("Updated value of num: " + num);
    }
}
