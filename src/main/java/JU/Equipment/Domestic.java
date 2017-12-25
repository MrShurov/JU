package JU.Equipment;

public class Domestic extends Equipment {
    private int lengthOfPowerCord;

    public Domestic(int power, int lengthOfPowerCord) {
        super(power);
        this.lengthOfPowerCord = lengthOfPowerCord;
    }

    public int getLengthOfPowerCord() {
        return lengthOfPowerCord;
    }

    public void setLengthOfPowerCord(int lengthOfPowerCord) {
        this.lengthOfPowerCord = lengthOfPowerCord;
    }
}
