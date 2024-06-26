package session_3_java_operators.practice;

public class PostIncrementPostDicrementOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = x++;
// post increment
        System.out.println("x: " + x);//6
        System.out.println("y: " + y);//5
        // post decrement
        int z =4;
        int w = z--;

        System.out.println( "z: " + z);//3
        System.out.println("w: "+ w);// 4

        int b = 3; // 2
        int c = ++b * 5 / b-- + --b; // 7
        System.out.println(" b is " +b);
        System.out.println(" c is " + c);






    }
}
