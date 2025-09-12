package methods;

public class methodParameters {
    public static void main(String[] args) {
        System.out.println(args[0]);
        for(String arg: args) {
            System.out.println(arg);
        }
//        average(2, 4);
        System.out.println("hello");
        int avgFromFunction = average(2, 4);
        System.out.println(avgFromFunction);
    }
//    public static void average(int a, int b) {
//        int avg = (a+b)/2;
//        System.out.println(avg);
//    }
    public static int average(int a, int b) {
        int avg = (a+b)/2;
        return avg;
    }

}


