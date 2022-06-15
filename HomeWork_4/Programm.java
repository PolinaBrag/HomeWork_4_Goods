package HomeWork_4;

public class Programm {

    public static void printInfoAboutGood(Goods goods) {
        System.out.println(goods);
    }
    public static void main(String[] args) {
        Milk milk1 = new Milk("Молоко Домик в деревне", 98.0, 1, "шт.", 1.5,3.2, "05-07-2022");
        Limonade limonade1 = new Limonade("Лимонад Кислинка", 87.5, 1, "шт.", 0.5);
        Bread bread1 = new Bread("Батон белый", 43.67, 1, "шт.", "15-06-2022", "пшеничная");
        Eggs eggs1 = new Eggs("Яйца Окские", 120.20, 1, "уп.", "20-06-2022", 20);
        Masks masks1 = new Masks("Маски", 90.0, 1, "уп.", 5);
        ToiletPaper toiletPaper1 = new ToiletPaper("Туалетная бумага Перышко", 250.80, 1, "уп.", 8, 4);
        Diapers diapers1 = new Diapers("Подгузники Huggies", 3500.0, 1, "уп.", 0, "да", 1, 3, 7, "подгузники");
        Pacifier pacifier1 = new Pacifier("Соска NUK", 450.90, 1, "шт.", 3, "да");

        printInfoAboutGood(milk1);
        printInfoAboutGood(limonade1);
        printInfoAboutGood(bread1);
        printInfoAboutGood(eggs1);
        printInfoAboutGood(masks1);
        printInfoAboutGood(toiletPaper1);
        printInfoAboutGood(diapers1);
        printInfoAboutGood(pacifier1);


    }
}
