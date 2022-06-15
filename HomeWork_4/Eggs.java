package HomeWork_4;

public class Eggs extends Food {
    
    private Integer countOfEggs;

    public Eggs(String title, Double price, Integer count, String unit, String expirationDate, Integer countOfEggs) {
        super(title, price, count, unit, expirationDate);
        this.countOfEggs = countOfEggs;
    }

    @Override
    public String toString() {
        return super.getInfo() + String.format("Количество яиц в упаковке: %d\n", this.countOfEggs);
    }
    
}
