
public class Discount {
    public static void main(String[] args) {
        int fee = 12500;
        int discountpercent = 10;
        int discount = (fee * discountpercent) / 100;
        int fee_after_discount = fee - discount;
        System.out.println(
                "The discount amount is INR  " + discount + " and final discounted fee is INR " + fee_after_discount);

    }

}
