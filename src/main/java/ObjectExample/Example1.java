package ObjectExample;
// main outside the class
class Example1 {
int id = 2;
String name ="Jack";
}

class ExampleTest{
    public static void main(String[] args) {
        Example1 e2=new Example1();
        System.out.println(e2.id+" " + e2.name);
    }
}