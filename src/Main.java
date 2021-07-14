public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(84,1350,210000);
        Car car = new Car(2001,"Universal","Opel", engine);
        System.out.println(car.getEngine().getHorsePower());
        engine.setHorsePower(12);
        System.out.println(car.getEngine().getHorsePower());
        car.getEngine().setHorsePower(12);
        System.out.println(car.getEngine().getHorsePower());
    }
}
