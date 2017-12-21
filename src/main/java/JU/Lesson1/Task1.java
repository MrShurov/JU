package JU.Lesson1;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
            if (array[i] % 2 == 0) {
                sum+=array[i];
            }
        }
        System.out.println(sum);
        }
    }
