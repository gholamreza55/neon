package exception;

public class Main {
    public static void main(String[] args) {
        try {
            ExceptioDemo.show();
        } catch (Throwable e) {
            System.out.println("an Exception error");
        }
    }
}
