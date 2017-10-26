package JU.Lesson1;

public class Task6 {

    public static void main(String[] args){
        int[] array = new int[5];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50 - 25);
        }
        bubbleSort(array);
        for (int i = 1;i < array.length - 1; i++){
            sum += array[i];
        }
        System.out.println(sum);
    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
}
