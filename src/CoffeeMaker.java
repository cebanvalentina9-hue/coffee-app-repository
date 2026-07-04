public class CoffeeMaker {
    Coffee makeCoffee(){
        System.out.println("Cafeaua se prepara...");
        int t = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        Coffee coffee = new Coffee(t, c);
        return coffee;
    }
}
