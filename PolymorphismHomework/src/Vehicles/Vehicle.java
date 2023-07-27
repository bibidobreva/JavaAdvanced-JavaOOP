package Vehicles;

public abstract class Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;

    protected Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public Double driving(double km){
        double fuelNeed = km*(fuelConsumption+getExtraLiters());
            if(fuelQuantity<fuelNeed){
                return null;
            }
        fuelQuantity-=fuelNeed;
            return km;
    }

    public void refueling(double litres){
        fuelQuantity+=actualLiters(litres);
    }

    public abstract double actualLiters(double liters);


    public abstract double getExtraLiters();

    @Override
    public String toString() {
        return String.format(getClass().getSimpleName()+": %.2f",fuelQuantity);
    }
}
