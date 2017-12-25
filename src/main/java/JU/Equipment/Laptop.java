package JU.Equipment;

public class Laptop extends Computer{
    private double batteryCapacity;

    public Laptop(String hardDrive, String videoCard, int power, double batteryCapacity) {
        super(hardDrive, videoCard, power);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
