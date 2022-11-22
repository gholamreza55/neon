package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String name = "null";
        boolean name1 = Optional.ofNullable(name).isPresent();
        // System.out.println(name1);
        System.out.println(name1);

    }
}
