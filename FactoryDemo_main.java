public class FactoryDemo_main {
    public static void main(String[] args) {
        FactoryDemo car1 = FactoryDemo.createCar("BMW M2");
        car1.showDetails();
    }
}
