package Polymorphism;
// compile time
//method overloading
public class Student {
    void Amount (int i){
        System.out.println("The Amount is :"+ i);
    }
    void Amount(float i){
        System.out.println("The Amount is :"+i);
    }
    void Amount (Double i){
        System.out.println("The Amount is :"+i);
    }
}
class test1{
    public static void main(String[] args) {
        Student s=new Student();
        s.Amount(2);
        s.Amount(3.4);
        s.Amount(11f);
    }
}