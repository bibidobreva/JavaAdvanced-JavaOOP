package HotelReservation;

public enum DiscountType {
    VIP(20),
    SecondVisit(10),
    None(0);

    double discount;
    DiscountType(double discount){
        this.discount=discount;
    }

    public double getDiscount() {
        return discount;
    }
}
