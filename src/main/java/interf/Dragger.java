package interf;

public class Dragger {
    public void drag(Draggerable draggerable) {
        draggerable.drag();
        System.out.println("Dragger Done");
    }
}