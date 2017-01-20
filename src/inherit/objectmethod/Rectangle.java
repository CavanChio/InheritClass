package inherit.objectmethod;

/**
 * Created by Cavan on 2017/1/20.
 */
public class Rectangle extends Geometry {
    double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b;
    }
}
