package JU.Equipment;

public class Equipment {
    private int power;
    private boolean isWorking;

    public Equipment(int power) {
        this.power = power;
    }

    public Equipment() {
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public void on(){
        this.isWorking = true;
    }

    public void off(){
        this.isWorking = false;
    }
}
