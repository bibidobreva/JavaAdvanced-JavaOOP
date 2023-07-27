package VehiclesExtension;


public class Bus extends Vehicle {


    protected Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }



    @Override
    public double actualLiters(double liters) {
        return liters;
    }

    @Override
    public double getExtraLiters() {
        return 1.4;
    }






}
