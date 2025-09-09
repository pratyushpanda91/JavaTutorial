package nestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
//        for (int count = 0; count < 10; count++) {
//            for (int i = 1; i < 6; i++) {
//                System.out.print(i+" ");
//            }
//            System.out.println("printed "+count);
//        }

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 5; i++) {
            int j = 0;
            while(j<=5){
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }
    }
}
