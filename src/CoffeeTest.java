public class CoffeeTest {
    static void main(String[] args) {
        CoffeeMaker mk = new CoffeeMaker();
        DrinkCoffee  d = new DrinkCoffee();

        for (int i = 0; i < 10; i++){
            Coffee coffee = mk.makeCoffee();

            System.out.println();

            try {
                d.drinkCoffee(coffee);
            }catch (TemperatureException e) {
                System.out.println("Exceptie T: " + e.getMessage() + "\ntemperatura: " + e.getT());
            }catch (ConcentrationException e){
                System.out.println("Exceptie C: " + e.getMessage() + "\nconcentratia: " +e.getC());
            }
            finally {
                System.out.println("Aparatul de cafea s-a oprit");
            }
            }
        }
    }



