package example2;

public class HelloThread1 extends Thread {

    @Override
    public void run() {
        String helloMsg = String.format("Hello, I'm %s", getName());
    }
}
