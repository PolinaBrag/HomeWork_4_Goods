package HomeWork_4;

public class ToiletPaper extends HygieneItems {
    
    private Integer countOfLayers;

    public ToiletPaper (String title, Double price, Integer count, String unit, Integer countInPackage, Integer countOfLayers) {
        super(title, price, count, unit, countInPackage);
        this.countOfLayers = countOfLayers;
    }

    @Override
    public String toString() {
        return super.getInfo() + String.format("Количество слоев: %d\n", this.countOfLayers);
    }

}
