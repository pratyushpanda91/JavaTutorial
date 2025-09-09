package Loops;

import java.util.Scanner;

public class SumOfNNaturalNumForloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        //n(n+1) sum of n natural num
        //1+2+3+4+5
        int sum = 0;
        for ( int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Sum is "+sum);

        //sum of n even nums
        int esum = 0;
        for ( int i=1; i<=n; i++){
//            esum = esum + 2*i;
            esum += 2*i;
        }
        System.out.println("N Even num Sum is "+esum);
    }
}
