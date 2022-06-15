package HomeWork_4;

public class Milk extends Drinks {

    private Double fatPercentage;
    private String expirationDateOfMilk;

    public Milk (String title, Double price, Integer count, String unit, Double volume, Double fatPercentage, String expirationDateOfMilk) {
        super(title, price, count, unit, volume);
        this.fatPercentage = fatPercentage;
        this.expirationDateOfMilk = expirationDateOfMilk;
    }

    @Override
    public String toString() {
        return super.getInfo() + String.format("Процент жирности: %.2f\nСрок годности: %s\n", this.fatPercentage, this.expirationDateOfMilk);
    }

    
}
