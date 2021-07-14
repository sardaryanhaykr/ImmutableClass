/**
 * Created by Hayk on 14.07.2021.
 */
public class Engine {
    private int horsePower;
    private int weight;
    private int mileage;

    public Engine(int horsePower, int weight, int mileage) {
        this.horsePower = horsePower;
        this.weight = weight;
        this.mileage = mileage;
    }
    public Engine(Engine engine){
        this(engine.horsePower,engine.weight,engine.mileage);
    }

    public Engine(int horsePower, int weight){
        this(horsePower,weight,0);
    }

    public Engine(){}

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", weight=" + weight +
                ", mileage=" + mileage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        if (horsePower != engine.horsePower) return false;
        if (weight != engine.weight) return false;
        return mileage == engine.mileage;
    }

    @Override
    public int hashCode() {
        int result = horsePower;
        result = 31 * result + weight;
        result = 31 * result + mileage;
        return result;
    }
}
