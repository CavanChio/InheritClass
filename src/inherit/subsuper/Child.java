package inherit.subsuper;

/**
 * Created by Cavan on 2017/1/20.
 */
public class Child extends Father {
    public int age;
    public Child() {
        count = 2;
        age = 20;
        System.out.println("Child is called!");
    }

    @Override
    public int getCount() {
        System.out.println("Child getCount()");
        return count;
    }

    public void setAge(int age) {
        System.out.println("Child setAge()");
        this.age = age;
    }

    public int getAge() {
        System.out.println("Child getAge()");
        return age;
    }
}
