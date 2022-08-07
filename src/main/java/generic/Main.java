package generic;

public class Main {
    public static void main(String[] args) {
        User user = new User(12);
        User user1 = new User(12);

        Integer max = user.compareTo(user1);
        System.out.println(max);

    }
}
   // public static void main(String[] args) {
//        GenericList<User> list = new GenericList<>();
//        list.add(new User());
//        User number = list.get(0);
//
//    }
//}
//    public static void main(String[] args) {
//        List list = new List();
//        list.add(Integer.valueOf(1));
//        list.add("sdf");
//        list.add(new User());
//
//        int number = (int) list.get(1);
//
//
//    }
//}
