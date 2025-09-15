package Oops3.learnPackage;

//import java.util.Scanner;
//import java.util.*;
public class person {

    public static int count = 0;
    private int age;

    private String name;

//    boolean canBeChanged = false;
    boolean canBeChanged = true;
    public void setAge(int age){
        if(canBeChanged){
            if(age > 0) {
                this.age = age;
            }
        }
    }

    boolean canBeAccessed = false;
    public int getAge(){
        if(canBeAccessed) return age;
        return -1;
    }
}
