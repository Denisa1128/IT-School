package session_3_java_operators.challenge;

public class Challenge13 {
    public static void main(String[] args) {
        int price = 100;
        int discount = 25;
        int priceWithDiscount = price * (price / discount);
        int finalprice = price -= discount;
        System.out.println(" Price with discound: "+ price);

    }
}
