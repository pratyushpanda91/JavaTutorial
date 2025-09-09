package conditionalStatement3;

public class nestedIfElse {
    public static void main(String[] args) {
       int a = 17;
       int b = 9;
       int c = 7;

       if(a>b){
           System.out.println(a+" is greater than "+b);
           if(a>c){
               System.out.println(a+" is the largest num among "+a+" "+b+" "+ c);
           } else {
               System.out.println(c+" is the largest num among "+a+" "+b+" "+ c);
           }
       } else {
           System.out.println(b+"is greater than "+a);
           if(b>c){
               System.out.println(b+" is the largest num among "+a+" "+b+" "+ c);
           } else {
               System.out.println(c+" is the largest num among "+a+" "+b+" "+ c);
           }

       }

    }
}
