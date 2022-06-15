package HomeWork_4;

public class Goods {

    protected String title;
    protected Double price;
    protected Integer count;
    protected String unit;

    public Goods(String title, Double price, Integer count, String unit) {
        this.title = title;
        this.price = price;
        this.count = count;
        this.unit = unit;
    }

    public String getInfo() {
        return String.format("Название товара: %s\nЦена в рублях: %.2f\nКоличество: %d\nЕдиница измерения: %s\n",
                this.title, this.price, this.count, this.unit);
    }

    @Override
    public String toString() {
        return this.getInfo();
    }

}
