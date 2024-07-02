package session_9_arrays.challenge;

import java.util.ArrayList;

public class Challenge2 {
    public static void main(String[] args) {
        ArrayList<String> wishList = new ArrayList<String>();
        wishList.add(" Red dress");
        wishList.add(" Books ");
        wishList.add(" Gift Cards ");
        wishList.add(" Sweets ");
        wishList.add("Winter Jacket ");

        System.out.println("My Christmas Wishlist: ");
        for (String item : wishList){
            System.out.println(" " + item);
        }

    }
}



