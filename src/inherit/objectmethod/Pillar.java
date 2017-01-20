package inherit.objectmethod;

/**
 * Created by Cavan on 2017/1/20.
 */
public class Pillar {
    Geometry bottom;//抽象类声明的对象
    double height;
    Pillar(Geometry bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }
    public double getVolume() {
        return bottom.getArea() * height;
    }
}
