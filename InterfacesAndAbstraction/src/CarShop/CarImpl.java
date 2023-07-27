package CarShop;



public class CarImpl implements Car {

    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduce;

    public CarImpl(String model, String color, Integer horsePower, String countryProduce) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduce = countryProduce;
    }

    public String getCountryProduce() {
        return countryProduce;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public String countryProduce() {
        return countryProduce;
    }

    @Override
    public String toString() {
         return String.format("This is %s produced in %s and have %d tires",model,countryProduce,TIRES);
    }
}
