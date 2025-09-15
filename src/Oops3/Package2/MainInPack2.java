package Oops3.Package2;
import Oops3.learnPackage.Teacher;

public class MainInPack2 extends Teacher {
    public static void main(String[] args) {
        Teacher obj1 = new Teacher();
//    obj1.id = 123;
        obj1.teachingClass = 4;
//        obj1.degree = "first";

        MainInPack2 mainpackage2 = new MainInPack2();
        mainpackage2.studentsCount = 100; //protected access
    }
}
