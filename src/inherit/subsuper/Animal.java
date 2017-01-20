package inherit.subsuper;

/**
 * Created by Cavan on 2017/1/20.
 */
public class Animal {
    public String color;
    public String kind;
    public double price;
    public void oldPrice(double a) {
        price = a;
        System.out.println("the price of animal is" +""+price);
    }

    float computer(float x, float y) {
        return x + y;
    }
    public int g(int x, int y) {
        return  x + y;
    }

}
