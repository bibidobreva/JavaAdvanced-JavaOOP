package VehiclesExtension;

public class Car extends Vehicle {
    protected Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
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
