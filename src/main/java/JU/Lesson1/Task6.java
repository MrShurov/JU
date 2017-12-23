package JU.Lesson1;

public class Task6 {

    public static void main(String[] args){
        int[] array = new int[10];
        int sum = 0;
        int min = 0;
        int max = 0;
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50 - 25);
        }
        for (int i = 0; i < array.length;i++){
            if(array[i] < min){
                min = array[i];
                indexMin = i;
            }
            if(array[i] > max){
                max = array[i];
                indexMax = i;
            }
        }
        if(indexMin > indexMax){
            for (int i = indexMax + 1;i < indexMin; i++){
                sum += array[i];
            }
        }
        if(indexMax > indexMin){
            for (int i = indexMin + 1;i < indexMax; i++){
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
