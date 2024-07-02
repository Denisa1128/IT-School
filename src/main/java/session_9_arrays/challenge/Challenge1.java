package session_9_arrays.challenge;

import java.util.ArrayList;

public class Challenge1 {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<String>();
        shoppingList.add(" Eggs ");
        shoppingList.add(" Bread ");
        shoppingList.add(" Milk ");
        shoppingList.add(" Bananas ");
        shoppingList.add(" Apples ");
        shoppingList.add(" Bacon ");

        System.out.println("Shopping List: ");
        for (String item : shoppingList){
            System.out.println(item);
        }


    }

}
