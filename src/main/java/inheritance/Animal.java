package inheritance;

interface Animal {
    abstract void dog();
    abstract void cat();
}
class ak implements Animal{
    @Override
    public void dog() {
        System.out.println(".......");
    }

    @Override
    public void cat() {
        System.out.println(">>>>>>>>>>>>>>>>>>");
    }

    public static void main(String[] args) {
        new ak().cat();
        new ak().dog();
    }
}