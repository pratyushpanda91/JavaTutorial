package conditionalStatement3;
import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        if( age >= 18){
            System.out.println("You can vote as your age is"+age);
        } else {
            System.out.println("You can not vote as your age is "+age);
        }
    }
}
