package src;
public class lMethod {
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    static int myMethod(int x) {
        return 5 + x;
    }
    
    public static void main(String[] args) {
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
        System.out.println(myMethod(3));
    }
}