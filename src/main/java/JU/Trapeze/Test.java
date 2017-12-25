package JU.Trapeze;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args){
        double maxSquare = 0;
        int id = 0;
        ArrayList<Trapezoid> arrayList = new ArrayList<>();
        arrayList.add(new Trapezoid(0,1,1,3,3,5,3,7,1));
        arrayList.add(new Trapezoid(1,1,1,3,3,5,3,1,8));
        arrayList.add(new Trapezoid(2,1,2,3,3,5,3,1,8));
        arrayList.add(new Trapezoid(3,1,1,3,3,5,3,1,5));
        arrayList.add(new Trapezoid(4,2,2,4,5,7,5,9,2));
        for (Trapezoid trapezoid:arrayList) {
            if (trapezoid.isIsoscelesTrapezoid()){
                trapezoid.setSquare(trapezoid.square());
                trapezoid.setPerimeter(trapezoid.perimeter());
                trapezoid.setH(trapezoid.h());
                System.out.println(trapezoid.toString());
            }
            if (maxSquare < trapezoid.getSquare()){
                maxSquare = trapezoid.getSquare();
                id = trapezoid.getId();
            }
        }
        System.out.println("Трапеция с самой больщой площадью " + arrayList.get(id).toString());
    }

}
