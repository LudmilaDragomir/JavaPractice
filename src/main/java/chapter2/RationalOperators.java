package chapter2;

public class RationalOperators {
    public static void main(String[] args) {
        int x = 10, y = 20, z = 10;
        System.out.println(x < y); // Outputs true
        System.out.println(x <= y); // Outputs true
        System.out.println(x >= z); // Outputs true
        System.out.println(x > z); // Outputs false

        Object obj = new RationalOperators();
        if  (obj instanceof RationalOperators){
            System.out.println("it is"); // Outputs true
        }
    }
}
