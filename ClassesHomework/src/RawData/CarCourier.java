package RawData;

public class CarCourier {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire tire;


    public CarCourier(String model, Engine engine, Cargo cargo, Tire tire){
        this.model = model;
        this.engine = engine;
        this.cargo =cargo;
        this.tire = tire;
    }

    public boolean isFragile(){
        return tire.tyrePressureUnder1();
    }
    public boolean isFlamable(){
        return engine.isEnginePowerOver250();
    }


    public String getModel() {
        return model;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tire getTire() {
        return tire;
    }
}
