package HomeWork_4;

public class Masks extends HygieneItems {

    public Masks (String title, Double price, Integer count, String unit, Integer countInPackage) {
        super(title, price, count, unit, countInPackage);
    }

    @Override
    public String toString() {
        return super.getInfo();
    }

    
}
