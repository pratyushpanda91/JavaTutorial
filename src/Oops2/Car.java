package Oops2;

public class Car extends Vehicle {
    String color;
    void start(){
        Scooter scooterObj =  new Scooter();
        scooterObj.braking(this);
        super.start();
        System.out.println(this.model+this.color+"Car is starting");
    }
    Car braking(){
        return this;
    }
//    Car(){
//        System.out.println("Car is being created");
//    }
    Car(){
        super(3 );
        System.out.println("Car is being created");
        System.out.println(this.wheelsCount);
    }
    public static void main(String[] args) {
        Car obj = new Car();
        obj.accelerate();
        System.out.println(obj.wheelsCount);
        obj.wheelsCount = 4;
        obj.model = "I10";
        obj.color = "Blue";
        obj.start();
        System.out.println(obj.wheelsCount);
    }
//    void accelerate(){
//
//    }

}

class Scooter {
    void braking(Car car){
        System.out.println(car.model+" is braking");
    }
}
