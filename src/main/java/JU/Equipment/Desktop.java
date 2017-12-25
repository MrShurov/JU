package JU.Equipment;

public class Desktop extends Computer {

    private String monitor;

    public Desktop(String hardDrive, String videoCard, int power, String monitor) {
        super(hardDrive, videoCard, power);
        this.monitor = monitor;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
}
