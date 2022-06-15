package HomeWork_4;

public class HygieneItems extends Goods {

    private Integer countInPackage;

    public HygieneItems(String title, Double price, Integer count, String unit, Integer countInPackage) {
        super(title, price, count, unit);
        this.countInPackage = countInPackage;
    }

    public String getInfo() {
        return String.format("Название товара: %s\nЦена в рублях: %.2f\nКоличество: %d\nЕдиница измерения: %s\nКоличество штук в упаковке: %d\n",
                super.title, super.price, super.count, super.unit, this.countInPackage);
    }

    @Override
    public String toString() {
        return this.getInfo();
    }

}
