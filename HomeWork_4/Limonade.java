package HomeWork_4;

public class Limonade extends Drinks{

    public Limonade(String title, Double price, Integer count, String unit, Double volume) {
        super(title, price, count, unit, volume);
    }
    
    @Override
    public String toString() {
        return super.getInfo();
    }
    
}
