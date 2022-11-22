package neonlearn;

public class Main {
    public static void main(String[] args) {
        Emploee emploee = new Emploee(50000,24);
        Emploee emploee1 = new Emploee(50000,24);
        Emploee emploee2 = new Emploee(452,24);
        int wag = emploee.calculator();
        System.out.println(wag);
        Emploee.printNumberofEmployee();
    }
}



//    public static void main(String[] args) {
//        Browser browser = new Browser();
//        browser.navigate("adress");
//    }
//
//
//
//}
//    public static void main(String[] args) {
//       Emploee emploee = new Emploee();
//       emploee.setBasesalary(5000);
//       emploee.setHourlyrate(25);
//
//       int wag = emploee.calculator(12);
//        System.out.println(wag);
//    }
//}


//
//        int basesalary = 50000;
//        int exrahoure = 10;
//        int hourlyrate = 20;
//        System.out.println(calculator(basesalary, exrahoure, hourlyrate));
//
//    }
//    public static int calculator(int basesalary, int exrahoure, int hourlyrate){
//        return basesalary + (exrahoure * hourlyrate);
//    }
//}




//}
//    public static void main(String[] args) {
//        String b = "";
//        String[] a = {"reza", "alireza", "ali"};
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length(); j++) {
//            }
//            System.out.println(a[i].length());
//
//            i = Math.max(i,a.length );
//        }
//     //   System.out.println(b);
//
//    }




//    public static void main(String[] args) {
//        TextBox textBox = new TextBox();
//        TextBox textBox1 = textBox;
//
//        textBox.setText("name");
//        System.out.println(textBox1.text);
//    }










//}
//    public static void main(String[] args) {
//        TextBox textBox = new TextBox();
//        TextBox textBox1 = new TextBox();
//
//        textBox.setText("box 1");
//        textBox1.setText("box 2");
//        System.out.println(textBox1.text);
//        System.out.println(textBox.text);
//    }
//
//}
