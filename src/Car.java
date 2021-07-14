/**
 * Created by Hayk on 14.07.2021.
 */
public final class Car {
    private int productionYear;
    private String model;
    private String mark;
    private Engine engine;

    public Car(int productionYear, String model, String mark, Engine engine) {
        this.productionYear = productionYear;
        this.model = model;
        this.mark = mark;
        this.engine =new Engine(engine);
    }

    public Car(int productionYear, String model, String mark){
        this(productionYear,model,mark,null);
    }

    public Car(int productionYear, String model){
        this(productionYear,model,"",null);
    }

    public Car(String model){
        this(0,model,"",null);
    }

    public Car(){
        this(0,null,"",null);
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public Engine getEngine() {
        return new Engine(engine);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (productionYear != car.productionYear) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (mark != null ? !mark.equals(car.mark) : car.mark != null) return false;
        return engine != null ? engine.equals(car.engine) : car.engine == null;
    }

    @Override
    public int hashCode() {
        int result = productionYear;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (mark != null ? mark.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "productionYear=" + productionYear +
                ", model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", engine=" + engine +
                '}';
    }
}




