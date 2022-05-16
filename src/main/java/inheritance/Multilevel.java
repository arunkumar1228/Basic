package inheritance;

class Multilevel {
    int x;
void Mul(int a){
     x =a;
    System.out.println(x);
}
}
class Multilevel1 extends Multilevel{
    int x1;
    void Mul1(int b){
        x1= b;
        System.out.println(x1);
    }
}
class Multilevel2 extends Multilevel1{
    int x2;
    void Mul2( int c){
        x2 =c;
        System.out.println(c);
        System.out.println(x*x1*x2);
    }
}
class Test{
    public static void main(String[] args) {
        Multilevel2 m = new Multilevel2();
        m.Mul(1);
        m.Mul1(2);
        m.Mul2(3);
    }
}