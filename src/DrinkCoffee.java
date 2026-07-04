public class DrinkCoffee {

    void drinCoffee(Coffee coffee) throws TemperatureException, ConcentrationException {
        if (coffee.getTemp() > 65) {
            throw new TemperatureException(coffee.getTemp(), "Cafeaua e prea fierbinte. O aruncam!");
        } else {
            System.out.println("t: " + coffee.getTemp());
        }
        if(coffee.getConc() > 55){
            throw new ConcentrationException(coffee.getConc(), "Concentratie prea mare. O aruncam");
        } else {
            System.out.println("c: " + coffee.getConc());
        }
    }
}
