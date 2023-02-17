package example2;

public class Example2 {

    public static void main(String [] args) {
        Thread thread = new HelloThread1();
        thread.start();
        System.out.println("Do something useful");

    }
}
