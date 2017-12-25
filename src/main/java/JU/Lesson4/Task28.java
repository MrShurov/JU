package JU.Lesson4;

import java.util.ArrayList;
import java.util.Iterator;

public class Task28 {

    public static void main(String[] args) {
        int mark = 0;
        int highest = 0;
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            mark = 1 + (int) (Math.random() * 10);
            marks.add(mark);
        }
        Iterator<Integer> iterator = marks.iterator();
        while (iterator.hasNext()) {
            mark = iterator.next();
            if (highest < mark) {
                highest = mark;
            }
        }
        System.out.println("Самая высокая оценка: " + highest);
    }
}
