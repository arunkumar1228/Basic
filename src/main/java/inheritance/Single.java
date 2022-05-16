package inheritance;

class Single {
    int sum1 ;
    void Add(int a) {
        sum1=a;
        System.out.println(sum1);
    }
}
class Single1 extends Single{
    int sum2;
    void Add1(int b){
        sum2=b;
        System.out.println(b);
        System.out.println(sum1+sum2);
    }

    public static void main(String[] args) {
        Single1 s=new Single1();
        s.Add(2);
        s.Add1(3);
        System.out.println();
    }
}