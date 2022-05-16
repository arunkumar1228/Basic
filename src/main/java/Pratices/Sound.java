package Pratices;

 interface Sound {
    abstract void Animal();
    abstract  void human();

}
class animal implements Sound{

    @Override
    public void Animal() {
        System.out.println("Wow");
    }

    @Override
    public void human() {
        System.out.println("Take");
    }
}
class Ex {
    public static void main(String[] args) {
        new animal().Animal();
        new animal().human();
    }
}