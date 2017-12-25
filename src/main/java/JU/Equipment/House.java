package JU.Equipment;

import java.util.ArrayList;

public class House {

    public static void main(String[] args){
        int sum = 0;
        Desktop desktop = new Desktop("KINGSTON SKC300S37A60G", "NVIDIA GeForce GTX 760",666,"LG 25UM58-P");
        Mixer mixer = new Mixer(333,20,true);
        desktop.on();
        mixer.off();
        mixer.on();
        ArrayList<Equipment> arrayList = new ArrayList<>();
        arrayList.add(desktop);
        arrayList.add(mixer);
        for (Equipment e:arrayList) {
            if (e.isWorking()){
                sum += e.getPower();
            }
        }
        System.out.println(sum);
    }
}
