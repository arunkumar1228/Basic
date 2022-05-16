package Method;

public class Method {
    int rollno;
    String name;


    void Data(int r,String s){
        rollno = r;
        name = s;
        System.out.println(rollno + " "+ name);
    }

    public static void main(String[] args) {
        Method m1= new Method();
        m1.Data(101,"Arun");
    }
}
