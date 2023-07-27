package HotelReservation;

public enum Season {
    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);

    int multiply;
    Season(int multiply){
        this.multiply = multiply;
    }

    public int getMultiply() {
        return multiply;
    }
}
