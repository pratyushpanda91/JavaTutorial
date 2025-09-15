package Oops2;

//public final class Vehicle // can not be inherited(extened)
public class Vehicle {

    final int gears = 4;

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(2);
//        v1.gears = 6;
    }
    int wheelsCount;
    String model;

    void start(){
        System.out.println("Vehicle is starting");
    }

    final void accelerate(){
        System.out.println("Vehicle is accelerating");
    }
    Vehicle(){
        System.out.println("Creating a vehicle instance");
    }
    Vehicle(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicle with wheels");
    }
}
