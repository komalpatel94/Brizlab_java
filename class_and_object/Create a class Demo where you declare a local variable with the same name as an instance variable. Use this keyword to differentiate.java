package Classes;

public class Demo {
    int number = 10;   

    void showNumber() {
        int number = 20;   
        System.out.println("Local variable: " + number);
        System.out.println("Instance variable (using this): " + this.number);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.showNumber();
    }
}
