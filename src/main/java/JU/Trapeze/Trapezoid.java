package JU.Trapeze;

import lombok.Data;

@Data
public class Trapezoid {
    private int id;
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double x4;
    private double y4;
    private double AB;
    private double BC;
    private double CD;
    private double AD;
    private double square;
    private double h;
    private double perimeter;

    public Trapezoid(int id,double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.id = id;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        this.AB = getLength(x1, y1, x2, y2);
        this.BC = getLength(x2, y2, x3, y3);
        this.CD = getLength(x3, y3, x4, y4);
        this.AD = getLength(x1, y1, x4, y4);
    }

    private static double getLength(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
    }

    public boolean isIsoscelesTrapezoid() {
        return AB == CD && BC != AD && y1 == y4 && y2 == y3;
    }

    public double h(){
        return getLength(x2,y2,x2,y1);
    }

    public double square(){
        return (BC + AD)/2 * h();
    }

    public double perimeter(){
        return AB + BC + CD + AD;
    }
}
