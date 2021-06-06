public class Car {
    private static final String brand = "Ford";
    private String model;
    int weight;
    protected int length;

    public Car() {
    }

    public Car(String model, int weight, int length) {
        this.model = model;
        this.weight = weight;
        this.length = length;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
