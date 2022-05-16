package ObjectExample;
// Initialization through reference
class Example2 {
    int id;
    String name ;

}
class ExampleTest1{
    public static void main(String[] args) {
        Example2 e3=new Example2();
        e3.id=3;
        e3.name="Jack";
        System.out.println(e3.id);
        System.out.println(e3.name);
    }
}