package src;

public class qConstructors {
    int x;
    String a;

    public qConstructors(int y, String b) {
      x = y;
      a = b;
    }
  
    public static void main(String[] args) {
      qConstructors myObj = new qConstructors(1, "day");
      System.out.println(myObj.a);
      System.out.println(myObj.x);
    }
}
