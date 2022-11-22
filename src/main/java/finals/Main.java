package finals;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        FinalExample finalExample = new FinalExample();
        StaticeExample staticeExample = new StaticeExample();
        out.println(staticeExample);
        out.println(finalExample.name);
        out.println(StaticeExample.add());
//        for (int i = 0; i < 10; i++) {
           // StaticeExample staticeExample = new StaticeExample();
//            System.out.println(staticeExample.counter);
        out.println(staticeExample.add());
        StaticeExample.StaticeExample2 staticeExample2 = new StaticeExample.StaticeExample2();
            out.println(staticeExample2.das());
        }
       // System.out.println(StaticeExample.add());
    }

