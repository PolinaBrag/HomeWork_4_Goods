package HomeWork_4;

public class ChildGoods extends Goods {

    private Integer minAge;
    private String hypoallergenicity;

    public ChildGoods (String title, Double price, Integer count, String unit, Integer minAge, String hypoallergenicity) {
        super(title, price, count, unit);
        this.minAge = minAge;
        this.hypoallergenicity = hypoallergenicity;
    }

    public String getInfo() {
        return String.format("Название товара: %s\nЦена в рублях: %.2f\nКоличество: %d\nЕдиница измерения: %s\nМинимальный возраст в месяцах: %d\nГипоаллергенность: %s\n",
                super.title, super.price, super.count, super.unit, this.minAge, this.hypoallergenicity);
    }

    @Override
    public String toString() {
        return this.getInfo();
    }

    
}
