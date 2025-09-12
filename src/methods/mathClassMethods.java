package methods;

public class mathClassMethods {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;

        System.out.println(Math.min(a, b));
        System.out.println(Math.sqrt(b));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.abs(-3));
        System.out.println(Math.random());
        System.out.println(getRandom(4, 10));
        System.out.println(Math.floor(5.9));
        System.out.println(Math.ceil(5.9));
        System.out.println(Math.round(5.1));
    }

    public static int getRandom(int a, int b) {
//        return (int) (Math.random()*6) + 1;
        return (int) (Math.random()*(b-a+1) + a);
    }
}
