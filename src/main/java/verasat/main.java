package verasat;

public class main {
    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(), new CheckBox()};
        for (UIControl control : controls) {
            System.out.println(control);
            control.render();
        }
    }
}
//
//
//        Point point = new Point(12, 10);
//        Point point1 = new Point(12, 10);
//        System.out.println(point.equals(point1));
//        System.out.println(point.hashCode());
//        System.out.println(point1.hashCode());
//
//
//
//    }
//}




//    public static void main(String[] args) {
//        UIControl control = new UIControl(true);
//        TextBox textBox = new TextBox();
//        show(control);
//    }
//
//    public static void show(UIControl control){
//        if (control instanceof TextBox){
//        TextBox textBox = (TextBox)control;
//        textBox.setText("salam");
//        }
//        System.out.println(control);
//    }
//}



//
//    public static void main(String[] args) {
//        TextBox textBox = new TextBox();
//        textBox.setText("gholamreza");
//        System.out.println(textBox.toString());
//        textBox.clear();
//
//    }

//    public static void main(String[] args) {
//
//        TextBox textBox = new TextBox();
//        TextBox textBox1 = textBox;
//        System.out.println(textBox1.hashCode());
//
//        System.out.println(textBox.hashCode());
//        System.out.println(textBox.equals(textBox1));
//        System.out.println(textBox.toString());
//
//    }
//}
