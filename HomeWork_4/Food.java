package HomeWork_4;

public class Food extends Goods {

    private String expirationDate;

    public Food(String title, Double price, Integer count, String unit, String expirationDate) {
        super(title, price, count, unit);
        this.expirationDate = expirationDate;
    }

    public String getInfo() {
        return String.format("Название товара: %s\nЦена в рублях: %.2f\nКоличество: %d\nЕдиница измерения: %s\nСрок годности: %s\n",
        super.title, super.price, super.count, super.unit, this.expirationDate);
    }

    @Override
    public String toString() {
        return super.getInfo();
    }
    
}
