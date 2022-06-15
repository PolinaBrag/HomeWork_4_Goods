package HomeWork_4;

public class Diapers extends ChildGoods {

    private Integer size;
    private Integer minWeight;
    private Integer maxWeight;
    private String typeOfDiapers;

    public Diapers(String title, Double price, Integer count, String unit, Integer minAge, String hypoallergenicity,
            Integer size, Integer minWeight, Integer maxWeight, String typeOfDiapers) {
        super(title, price, count, unit, minAge, hypoallergenicity);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.typeOfDiapers = typeOfDiapers;
    }

    @Override
    public String toString() {
        return super.getInfo()
                + String.format("Размер: %d\nМинимальный вес: %d\nМаксимальный вес: %d\nТип: %s\n", this.size,
                        this.minWeight, this.maxWeight, this.typeOfDiapers);
    }
}
