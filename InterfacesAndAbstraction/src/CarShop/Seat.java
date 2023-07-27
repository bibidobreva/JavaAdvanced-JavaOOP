package CarShop;

public class Seat extends CarImpl implements Sellable{

    private double price;

    public Seat(String model, String color, Integer horsePower, String countryProduce, double price) {
        super(model, color, horsePower, countryProduce);
        this.price = price;
    }

    @Override
    public Integer getHorsePower() {
        return super.getHorsePower();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public String countryProduce() {
        return super.countryProduce();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString())
                .append(System.lineSeparator())
                .append(String.format("%s sells for %f",getModel(),price));
        return stringBuilder.toString();
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
