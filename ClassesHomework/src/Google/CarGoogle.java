package Google;

public class CarGoogle {
    // "{Name} car {carModel} {carSpeed}"
    private String carModel;
    private String carSpeed;

    public CarGoogle(String carModel, String carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.carModel,this.carSpeed);
    }
}
