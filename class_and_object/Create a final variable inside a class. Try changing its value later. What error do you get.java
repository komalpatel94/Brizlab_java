package Classes;

public class FinalDemo {
    final int value = 100;  
    void changeValue() {
      
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.changeValue();
    }
}
