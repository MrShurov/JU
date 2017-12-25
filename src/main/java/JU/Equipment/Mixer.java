package JU.Equipment;

public class Mixer extends Domestic {
    private boolean turboMode;

    public Mixer(int power, int lengthOfPowerCord, boolean turboMode) {
        super(power, lengthOfPowerCord);
        this.turboMode = turboMode;
    }

    public boolean isTurboMode() {
        return turboMode;
    }

    public void setTurboMode(boolean turboMode) {
        this.turboMode = turboMode;
    }
}
