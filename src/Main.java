public class Main {
    public static void main(String[] args) {
        System.out.println("БОНУСЫ АВИАПЕРЕВОЗЧИКА");
        int amount = 7_635;
        int priceMile = 20;
        System.out.println("Цена авиабилета: " + amount);
        int miles = amount / priceMile;
        System.out.println("Начислено миль: " + miles);
    }
}