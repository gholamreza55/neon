package finals;

public class StaticeExample {
    public static int counter = 0;
    static int c = 5;

    public StaticeExample() {
        counter++;
    }
    public static int add(){
        return counter * 4 + c;
    }
    public static class StaticeExample2{
        int n = 21;
        public int das(){
            return n * counter;
        }
    }

}
