package HomeWork_4;

public class Bread extends Food {

    private String typeOfFlour;

    public Bread (String title, Double price, Integer count, String unit, String expirationDate, String typeOfFlour) {
        super(title, price, count, unit, expirationDate);
        this.typeOfFlour = typeOfFlour;
    }

    @Override
    public String toString() {
        return super.getInfo() + String.format("Тип муки: %s\n", this.typeOfFlour);
    }
    
}
