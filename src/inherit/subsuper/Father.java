package inherit.subsuper;

/**
 * Created by Cavan on 2017/1/20.
 */
public class Father {
    public int count;
    public Father() {
        count = 1;
        System.out.println("Father is called.");
    }
    public void setCount(int count) {
        System.out.println("Father setCount()");
        this.count = count;
    }
    public int getCount() {
        System.out.println("Father getCount()");
        return count;
    }

}
