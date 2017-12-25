package JU.Equipment;

public class Computer extends Equipment {
    private String hardDrive;
    private String videoCard;

    public Computer(String hardDrive,String videoCard,int power){
        super(power);
        this.hardDrive = hardDrive;
        this.videoCard = videoCard;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }
}
