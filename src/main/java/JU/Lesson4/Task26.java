package JU.Lesson4;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Task26 {

    public static void main(String[] args) {
        int mark = 0;
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            mark = 1 + (int) (Math.random() * 10);
            marks.add(mark);
        }
        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i) < 4) {
                marks.remove(i);
                i--;
            }
        }
        System.out.println(marks);
    }
}
