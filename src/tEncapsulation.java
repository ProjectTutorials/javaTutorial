package src;

public class tEncapsulation {
    public static void main(String[] args) {
        //sEncapsulation myObj1 = new sEncapsulation();
        //myObj1.name = "John";  // error
        //System.out.println(myObj1.name); // error 

        sEncapsulation myObj2 = new sEncapsulation();
        myObj2.setName("John"); 
        System.out.println(myObj2.getName()); // John
    }
}
