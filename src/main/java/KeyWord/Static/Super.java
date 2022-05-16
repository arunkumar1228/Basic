package KeyWord.Static;

public class Super {
    int a=10;
}
class Super1 extends Super{
   public void ak (){
        System.out.println(super.a);
    }
}
class test {
    public static void main(String[] args) {

    Super1 s2= new Super1();
    s2.ak();
}}