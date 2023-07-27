package CarSalesman;

public class CarEngine {
    private String model;
    private int power;
    private int displacement=0;
    private String efficiency ="n/a";

    public CarEngine(){

    }

    public CarEngine(String model, int power){
        this.model = model;
        this.power=power;
    }
    public CarEngine(String model, int power,int displacement){
        this.model = model;
        this.power=power;
        this.displacement = displacement;
    }
    public CarEngine(String model, int power,String efficiency){
        this.model = model;
        this.power=power;
        this.efficiency = efficiency;
    }
    public CarEngine(String model, int power, int displacement, String efficiency){
        this.model = model;
        this.power=power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public int getDisplacement() {
        return displacement;
    }

    public int getPower() {
        return power;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
