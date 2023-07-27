package VehiclesExtension;

public abstract class Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    protected Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public Double driving(double km){
        double fuelNeed = km*(fuelConsumption+getExtraLiters());
            if(fuelQuantity<fuelNeed){
                return null;
            }
        fuelQuantity-=fuelNeed;
            return km;
    }

    public Double drivingEmpty(double km){
        double fuelNeed = km*(fuelConsumption);
        if(fuelQuantity<fuelNeed){
            return null;
        }
        fuelQuantity-=fuelNeed;
        return km;
    }


    public boolean refueling(double litres){
        if(litres<=0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        double litresToAdd = actualLiters(litres);
        if(litresToAdd+fuelQuantity>tankCapacity){
            return false;
        }
        fuelQuantity+=actualLiters(litres);
        return true;
    }

    public abstract double actualLiters(double liters);


    public abstract double getExtraLiters();

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }





    @Override
    public String toString() {
        return String.format(getClass().getSimpleName()+": %.2f",fuelQuantity);
    }
}
