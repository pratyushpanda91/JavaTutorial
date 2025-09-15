package Oops3.encapsulation;

import Oops3.learnPackage.person;

public class MainInEncapsulation {

    static {
        System.out.println("Called from the static block");
    }
    public static void main(String[] args) {
        person p1 = new person();
        p1.setAge(12);
        System.out.println(p1.getAge());

        person.count = 50;

        person p2 = new person();
        System.out.println(person.count);
    }

    static {
        System.out.println("Called from the 2nd static block");
    }
}
