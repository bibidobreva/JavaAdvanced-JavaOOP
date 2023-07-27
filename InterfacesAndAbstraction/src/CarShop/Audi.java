package CarShop;

public class Audi extends CarImpl implements Rentable {

    private Integer minRentDay;
    private Double pricePerDay;
    public Audi(String model, String color, Integer horsePower, String countryProduce, Integer minRentDay,Double pricePerDay) {
        super(model, color, horsePower, countryProduce);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getHorsePower() {
        return super.getHorsePower();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString())
                .append(System.lineSeparator())
                .append(String.format("Minimum rental period of %d days. Price per day %f",minRentDay,pricePerDay));
        return stringBuilder.toString();
    }
}
