package CarSalesman;

public class CarForSale {
    private  String model;
    private  String engine;
    private  int weight=0;
    private String color="n/a";
    private CarEngine carEngine;

    public CarForSale(String model, String engine){
        this.model = model;
        this.engine = engine;

    }
    public CarForSale(String model, String engine, int weight){
        this.model = model;
        this.engine = engine;
        this.weight = weight;
    }
    public CarForSale(String model, String engine,String color){
        this.model = model;
        this.engine = engine;
        this.color = color;
    }
    public CarForSale(String model, String engine,int weight, String color){
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }
    public CarForSale(){};

    public void setCarEngine(CarEngine carEngine) {
        this.carEngine = carEngine;
    }

    @Override
    public String toString() {
        String weight1 =""+this.weight;
        if(this.weight==0){
            weight1="n/a";
        }
        String displacement1 = ""+ carEngine.getDisplacement();
        if(carEngine.getDisplacement()==0){
            displacement1="n/a";
        }
return String.format("%s:%n%s:%nPower: %d%nDisplacement: %s%nEfficiency: %s%nWeight: %s%nColor: %s",
        this.model,carEngine.getModel(),carEngine.getPower(),displacement1,carEngine.getEfficiency(),weight1,this.color);
    }
}
