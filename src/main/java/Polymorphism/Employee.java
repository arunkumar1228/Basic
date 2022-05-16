package Polymorphism;
//run time
//method overriding
public class Employee {
    void name(String name){
        System.out.println("Employee name is :"+name);
    }
}

class Employee1 extends Employee{
    void name(String name ){
        System.out.println("Employee1 name is :"+name);
    }
}
class test2{
    public static void main(String[] args) {
        Employee em=new Employee1(); // upcasting
        em.name("Arun");
    }
}
