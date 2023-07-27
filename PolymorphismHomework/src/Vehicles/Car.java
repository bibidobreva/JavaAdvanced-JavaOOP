package Vehicles;

public class Car extends Vehicle{
    protected Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public double actualLiters(double liters) {
        return liters;
    }

    @Override
    public double getExtraLiters() {
        return 0.9;
    }
}
