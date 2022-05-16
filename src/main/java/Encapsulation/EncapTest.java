package Encapsulation;

public class EncapTest {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String newname){
        name=newname;
    }
    public void setAge(int newage){
        age=newage;
    }
}