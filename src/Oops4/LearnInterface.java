package Oops4;

public class LearnInterface {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.drinks();

        System.out.println(Animal.LEGS);

    }

}

interface Pet {
    void sings();
    void drinks();
    default void walk(){
        System.out.println("Monkey is walking");
    }
}

interface Animal {
//    public static final int LEGS = 4;
    int LEGS = 4;
    void eats();
    void drinks();
}

class Monkey implements Animal, Pet {

    @Override
    public void eats() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey is drinking");
    }

    @Override
    public void sings() {
        System.out.println("Monkey is singing");
    }
}