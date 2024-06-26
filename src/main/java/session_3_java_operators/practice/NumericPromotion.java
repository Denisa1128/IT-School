package session_3_java_operators.practice;

public class NumericPromotion {
    public static void main(String[] args) {
         short e = 10;
         int f = e + 5;

         long a = 1000000000000L;
         // wrapper classes
        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MAX_VALUE;

        int maxIntValue = Integer.MAX_VALUE;

        System.out.println(" MaxLongValue:  "+ maxLongValue);
        System.out.println(" MinLongValue: "+ minLongValue);
        System.out.println(" Max integer value :" +maxIntValue);

        long testLongValue = 12545445454545454L;
        // max int 4545454545
        // max long: 545545454545445444
        int newIntValue = (int)testLongValue;
        System.out.println(" Test long value :"+ testLongValue);
        System.out.println("New Int value:" +newIntValue);




    }
}
