package HotelReservation;

public class PriceCalculator {
    public static void price(double pricePerDay, int days,Season season, DiscountType discountType) {
    double price = (pricePerDay*season.getMultiply())*days;
    price = price-(price*(discountType.getDiscount()/100));
        System.out.printf("%.2f",price);
    }
}
