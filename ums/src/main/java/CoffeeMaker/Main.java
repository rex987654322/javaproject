package CoffeeMaker;

public class Main {
    public static void main(String[] args) {
//        Heater electricHeater = new ElectricHeater();
//        Cooler electricCooler = new ElectricCooler();
        Tyre electrictyre = new CeatTyre();
        CoffeeMaker coffeeMaker = new CoffeeMaker(electrictyre);
//        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.brewCoffee();
    }
}
