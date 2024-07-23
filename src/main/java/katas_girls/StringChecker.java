package katas_girls;

public class StringChecker {
    public static void main(String[] args) {

        String test = "abbababab";
        String test1 ="aaa";
        String test2 ="bbbb";
        System.out.println(checkString(test));
        System.out.println(checkString(test1));
        System.out.println(checkString(test2));
    }

    public static boolean checkString(String text) {
        if (text.contains("a")&& text.contains("ab")){

            return true;
    }
             return false;
}


    }



