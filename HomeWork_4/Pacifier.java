package HomeWork_4;

public class Pacifier extends ChildGoods {

    public Pacifier (String title, Double price, Integer count, String unit, Integer minAge, String hypoallergenicity) {
        super(title, price, count, unit, minAge, hypoallergenicity);
    }

    @Override
    public String toString() {
        return super.getInfo();
    }
    
}
