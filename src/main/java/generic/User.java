package generic;

public class User implements Comparable <User>{
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User o) {
        if (points <= o.points)
        return -1;
        else if (points == o.points)
            return 0;
        else
            return 1;
    }
}
