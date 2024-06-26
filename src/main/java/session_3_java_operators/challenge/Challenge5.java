package session_3_java_operators.challenge;

public class Challenge5 {
    public static void main(String[] args) {
        int x = 20;
        x += 10;
        System.out.println("The compound addition: "+x);

        x -=20;
        System.out.println("The compound subtraction: "+x);
        x *= 20;
        System.out.println("The compound multiplication :"+x);
        x /= 20;
        System.out.println("The compound division:"+x);
        x %= 20;
        System.out.println("The compound modulus: "+x);
        x &=  20;
        System.out.println("The compound Bitwise :"+x);
        x  |= 20;
        System.out.println("The compound Bitwis |:"+ x);
        x ^= 20;
        System.out.println("The compound Bitwise ^: "+x);
        x >>= 20;
        System.out.println("The compound right-shift filled: "+x);
        x >>>=20;
        System.out.println("The compound right-shift filled 0 >>>:"+x);
        x<<= 20;
        System.out.println("The compound left-shift: "+x);



    }
}
