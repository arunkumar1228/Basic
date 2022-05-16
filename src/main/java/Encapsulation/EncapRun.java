package Encapsulation;

public class EncapRun extends EncapTest{
    public static void main(String[] args) {
        EncapRun en = new EncapRun();
        en.setName("Arun");
        en.setAge(23);
        System.out.println("Yoor name is :"+ en.getName() +"\n"+ "Your age is :"+en.getAge());

    }

}
