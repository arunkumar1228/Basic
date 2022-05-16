package Control;

class Variable {
    int a = 10;
    String b = "Java";
    Double c = 10.0;
    char d = 'a';
    float e = 10f;


    public  static void main(String[] args) {
        Variable v = new Variable();
        System.out.println(v.a);
        System.out.println(v.b);
        System.out.println(v.c);
        System.out.println(v.d);
        System.out.println(v.e);
    }
}