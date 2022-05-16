package Abstration;

abstract class Ab {
    abstract void run();
}
class ab1 extends Ab{
    @Override
    void run() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new ab1().run();
    }
}