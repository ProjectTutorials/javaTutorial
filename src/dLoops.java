package src;
public class dLoops {
    public static void main(String[] args){
        int time = 22;
        if(time < 12){
            System.out.println("Morning!");
        }
        else if(time > 12){
            System.out.println("Evening!");
        }
        else{
            System.out.println("error!");
        }

        // other method 
        String greet = (time < 12) ? "Morning!" : "Evening!";
        System.out.println(greet);
    }
}
