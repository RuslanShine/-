public class Car extends Transport {
    String brand;
    int horsePower;
    boolean isAwd;
    float acceleration;

    public Car() {
        brand = "Mazda";
        horsePower = 100;
        isAwd = true;
        acceleration = 10;
        type = "Car";
    }

    public Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
        type = "Car";
    }

    public void start() {
        System.out.println(brand + " was started");
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public float countSpeed(float time) {
        return (100 / acceleration) * time;
    }

    @Override
    public void ride() {
        System.out.println("Riding car");
    }


    public String toString() {
        return "brend =  " + brand + "\n"
                + "horsePower = " + horsePower + "\n"
                + "isAwd = " + isAwd + "\n"
                + "acceleration = " + acceleration + "\n"
                + "type = " + type;

    }
}
