package Oops4;

public class LearnInnerClass {
    class Toy{
        int price;
    }
    static class PlayStation{

    }
    public static void main(String[] args) {
//        Toy toy = new LearnInnerClass(). new Toy();
        LearnInnerClass obj = new LearnInnerClass();
        Toy toy = obj.new Toy();
        toy.price = 45;

        PlayStation playStation = new LearnInnerClass.PlayStation();
    }
}
