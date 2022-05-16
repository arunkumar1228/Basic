package KeyWord.Static;

class Vk {
    int a ;
    int b ;
    Vk(int a ,int b)
    {
        this.a=a;
        this.b=b;
    }
    void display1(){
        System.out.println("a = " + a + "  b = " + b);
    }
    public static void main(String[] args) {
        Vk s=new Vk(1,2);
        s.display1();
    }
}
