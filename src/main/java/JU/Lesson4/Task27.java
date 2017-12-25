package JU.Lesson4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task27 {

    public static void main(String[] args){
        int number = 0;
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            arrayList.add((int) (Math.random() * 10));
        }
        HashSet set = new HashSet(arrayList);
        System.out.println(set);
    }
}
