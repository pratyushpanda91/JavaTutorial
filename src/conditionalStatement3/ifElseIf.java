package conditionalStatement3;

public class ifElseIf {
    public static void main(String[] args) {
        int day = 1;
        if(day == 3){
            System.out.println("go to home");
        } else if(day == 2){
            System.out.println("Go for party");
        } else if (day == 3){
            System.out.println("Go to your village");
        }  else {
            System.out.println("Dont go");
        }
        System.out.println("Went somewhere today");
    }
}
