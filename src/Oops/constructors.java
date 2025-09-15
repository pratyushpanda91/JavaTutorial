package Oops;

public class constructors {
    public static void main(String[] args) {

        ComplexNum num1 = new ComplexNum(2, 3);
        ComplexNum num2 = new ComplexNum(3, 4);
        num1.print();
        num2.print();
        System.out.println("Add 2 nums");
        ComplexNum result = num1.add(num2);
        System.out.println(num1);
        result.print();

    }
}

class ComplexNum {
    int a, b;

//    public ComplexNum(int real, int imaginary) {
//        a = real;
//        b= imaginary;
//    }
    public ComplexNum(int a, int b) {
            this.a = a;
            this.b= b;
    }

    void print(){

        System.out.println(a+" + "+b+"i");
    }

    ComplexNum add(ComplexNum num2){
        System.out.println(this);
        this.print(); //invoke current object ( this always store current obj)
        num2.print();
        return new ComplexNum(a+ num2.a, b+ num2.b);
    }
}
