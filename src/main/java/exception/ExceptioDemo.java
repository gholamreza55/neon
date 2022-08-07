package exception;

import java.io.IOException;

public class ExceptioDemo {
    public static void show() {
       Account account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            e.printStackTrace();
        }
    }

    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
