package Oops;

public class methodOverLoading {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greetings();
        obj.greetings("Omm");
        obj.greetings("Om", 5);

    }
}

class Greet {
    void greetings(){
        System.out.println("Hello, Good morning");
    }
    void greetings(String name){
        System.out.println("Hello "+name+", Good Morning");
    }
    void greetings(String name, int count){
        for (int i = 0; i < count; i++) {
            System.out.println("Hello "+name+", Good Morning");
        }
    }
}
