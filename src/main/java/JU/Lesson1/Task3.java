package JU.Lesson1;

public class Task3 {
    public static void main(String[] args) {
        int butterflyArray[][] = new int[7][7];

        for (int i = 0; i < butterflyArray.length / 2; i++) {
            for (int j = i; j < butterflyArray[0].length - i; j++) {
                butterflyArray[i][j] = 1;
            }
        }

        for (int i = butterflyArray.length / 2; i < butterflyArray.length; i++) {
            for (int j = butterflyArray[0].length - 1 - i; j <= i; j++) {
                butterflyArray[i][j] = 1;
            }
        }

        for (int[] aButterflyArray : butterflyArray) {
            for (int j = 0; j < butterflyArray[0].length; j++) {
                System.out.print(aButterflyArray[j]);
            }
            System.out.println();
        }

    }
}
