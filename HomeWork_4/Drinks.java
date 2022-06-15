package HomeWork_4;

public class Drinks extends Goods {

    private Double volume;

    public Drinks(String title, Double price, Integer count, String unit, Double volume) {
        super(title, price, count, unit);
        this.volume = volume;
    }

    public String getInfo() {
        return String.format("Название товара: %s\nЦена в рублях: %.2f\nКоличество: %d\nЕдиница измерения: %s\nОбъём в литрах: %.2f\n",
        super.title, super.price, super.count, super.unit, this.volume);
    }
    
    @Override
    public String toString() {
        return this.getInfo();
    }


}
