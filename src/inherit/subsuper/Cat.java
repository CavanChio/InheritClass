package inherit.subsuper;

/**
 * Created by Cavan on 2017/1/20.
 */
public class Cat extends Animal {
    public int price;
    public void newPrice(int a) {
        price = a;
        System.out.println("the price of cat is" +""+price);
    }
    public float computer(float x, float y){
        return x * y;
    }

}
