public class FactoryDemo {

    private String model;

    private FactoryDemo(String model){
        this.model = model;
    }

    public static FactoryDemo createCar(String model){
        return new FactoryDemo(model);
    }

    public void showDetails(){
        System.out.println("Car Model: " + model);
    }
}
