package src;

public class sEncapsulation {
    private String name; // restricted access

    // Setter
    public void setName(String newName) {
      this.name = newName;
    }

    // Getter
    public String getName() {
      return name;
    }
}
