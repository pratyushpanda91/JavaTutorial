package Oops4;

class Data {
    int data;

    public void printData() {
        System.out.println(data);
    }

    public void printData(int times){
        for (int i = 0; i < times; i++) {
            System.out.println(data);
        }
    }
}

class childData extends Data {
    @Override
    public void printData(){
        System.out.println("overriden "+ data);
    }
}



public class LearnPolymorphism {
    public static void main(String[] args) {
       Data d;
       d = new childData();
       d.printData();// runtime polymorphism
        Data d2 = new Data();
        d2.printData(6); //compiletime polymorphism
    }
}
