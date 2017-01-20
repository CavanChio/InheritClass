package inherit.subsuper;

/**
 * Created by Cavan on 2017/1/20.
 */
public class Father {
    public int count;
    public String name;
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

    public String gender = "父类属性";
//    public String getGender() {
//        return gender;
//    }

    public void method(){
        System.out.println("这是父类的方法"+ this.getClass());
    }
}
