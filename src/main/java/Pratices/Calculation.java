package Pratices;

class Calculation {

    void fact(int n) {
        int fact = 1;
        for (int i = 1; i <=n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}

class Cal {

    public static void main(String[] args) {
        new Calculation().fact(6);
    }
}

