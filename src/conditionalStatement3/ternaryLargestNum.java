package conditionalStatement3;

public class ternaryLargestNum {
    public static void main(String[] args) {
        int a = 27;
        int b = 78;
        int c = 98;
        int max = 0;
        max = a > b ? a : b;
        System.out.println("vale of max "+max);
        int max2 = 0;
        max2 = a>b?a>c?a:c:b>c?b:c;
        System.out.println("vale of max2 "+max2);
    }
}
