package Oops4;


class Car1 {
    String model;
    int year;
    public Car1(String model, int year){
        this.model = model;
        this.year = year;
    }

    @Override
    public int hashCode(){
        int initialNumber = 31;
        initialNumber += year;
        initialNumber += model.hashCode();
        return initialNumber;
    }

//    @Override
//    public boolean equals(Object obj) {
//        Car1 that = (Car1)obj;
//        if(this.model.equals(that.model) && this.year == that.year){
//            return true;
//        }
//        return false;
//    }




//    @Override
//    public String toString(){
//        return "Car ka model "+model+" and year is "+year;
//    }
}


public class LearnObjectClass {
    public static void main(String[] args) {
        Car1 obj1 = new Car1("Honda", 2022);
        Car1 obj2 = new Car1("Honda", 2020);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
