package generic1;

public class List {
    private Object[] items = new Object[10];
    private int count;

    public void add(Object item){
        items[count++] = item;
    }
    public Object get(int index){
        return items[index];
    }
}
//    private User[] items = new User[10];
//    private int count;