package uperSuper;

public class Child extends Person{
    int salary;

    public Child(String name, String family, int salary) {
        super(name,family);
        this.salary = salary;
        System.out.println("Child");

    }
    public void print(){
        System.out.println(name+ " " + family + " " + salary);
    }


}
