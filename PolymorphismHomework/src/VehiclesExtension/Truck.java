package VehiclesExtension;

public class Truck extends Vehicle {
    protected Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public double actualLiters(double liters) {
        return liters*0.95;
    }

    @Override
    public double getExtraLiters() {
        return 1.6;
    }
}
