package JU.Trapeze;

import java.util.ArrayList;

import static JU.Trapeze.Trapezoid.amountTrapezoidWithLargerThanAverageArea;

public class Test {

    public static void main(String[] args){
        double maxSquare = 0;
        int id = 0;
        ArrayList<Trapezoid> arrayList = new ArrayList<>();
        arrayList.add(new Trapezoid(0,1,1,3,3,5,3,7,1));
        arrayList.add(new Trapezoid(1,2,1,2,6,5,6,1,8));
        arrayList.add(new Trapezoid(2,1,1,1,6,5,6,1,8));
        arrayList.add(new Trapezoid(3,1,1,3,3,5,3,1,5));
        arrayList.add(new Trapezoid(4,2,1,4,3,6,3,8,1));
        for (Trapezoid trapezoid:arrayList) {
                trapezoid.setSquare(trapezoid.square());
                trapezoid.setPerimeter(trapezoid.perimeter());
                trapezoid.setH(trapezoid.h());
            if (maxSquare < trapezoid.getSquare()){
                maxSquare = trapezoid.getSquare();
                id = trapezoid.getId();
            }
            System.out.println(trapezoid.getId() + " " + trapezoid.isIsoscelesTrapezoid());
        }
        System.out.println("Трапеция с самой больщой площадью " + arrayList.get(id).toString());
        System.out.println("Количество трапеций, у которых площадь больше средней площади: " + amountTrapezoidWithLargerThanAverageArea(arrayList));
    }
}
