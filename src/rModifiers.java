package src;

public class rModifiers {
    // final(cant be changed)
    // static
    // public
    // private(can be accessed in declrd class)
    // protected

      // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[ ] args) {
    myStaticMethod(); // Call the static method

    // myPublicMethod(); This would output an error
    rModifiers myObj = new rModifiers(); 
        // Create an object of Main
    myObj.myPublicMethod(); 
        // Call the public method
  }
}
