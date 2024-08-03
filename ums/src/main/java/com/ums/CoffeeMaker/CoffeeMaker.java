package CoffeeMaker;

public class CoffeeMaker {
    private final Tyre tyre;
   // ElectricHeater heater = new ElectricHeater();

    public CoffeeMaker(Tyre tyre) {
        this.tyre = tyre;
    }
        public void brewCoffee() {
            tyre.heat();
            System.out.println("Brewing Tyres");
        }

//        public void brewCoffee() {
////            heater.heat();
//              heat();
//            System.out.println("Brewing coffee");
//        }

}
