package JU.Lesson1;

public class Task2 {
    public static void main(String[] args){
        int[] array = new int[20];
        int positiveCounter = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
            if (array[i] > 0) {
                positiveCounter++;
            }
        }
        int[] positive = new int[positiveCounter];
        for (int anArray : array) {
            if (anArray > 0) {
                positive[counter] = anArray;
                counter++;
            }
        }
        for (int aPositive : positive) {
            System.out.print(aPositive + " ");
        }
    }
}
