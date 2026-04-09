import java.util.*;

public class Discount_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int discountpercent = sc.nextInt();
        int discount = (fee * discountpercent) / 100;
        int fee_after_discount = fee - discount;
        System.out.println(
                "The discount amount is INR  " + discount + " and final discounted fee is INR " + fee_after_discount);

    }

}
