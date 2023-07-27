package SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelPerKM;
    private int distanceTravelled;


    public Car(String model, double fuelAmount, double fuelPerKM) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelPerKM = fuelPerKM;
        this.distanceTravelled=0;
    }

    public void carDrive(int distance) {
        if (canCarDrive(distance)) {
            this.distanceTravelled += distance;
            this.fuelAmount-=distance*fuelPerKM;

        } else {
            System.out.println("Insufficient fuel for the drive");
        }

    }


    public boolean canCarDrive(int distance) {
        if (this.fuelAmount < distance * this.fuelPerKM) {
            return false;
        } else return true;

    }



    @Override
    public String toString() {
        return String.format("%s %.2f %d",this.model,this.fuelAmount, this.distanceTravelled);
    }
}
