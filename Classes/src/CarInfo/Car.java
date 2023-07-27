package CarInfo;

public class Car {
    private String brand;
    private String model;
    private int horsepower;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public Car(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsepower = -1;
    }
    public Car(){

    }


    public Car(String brand, String model, int horsepower) {
        this(brand);
        this.model = model;
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.",this.brand,this.model,this.horsepower);
    }
}
