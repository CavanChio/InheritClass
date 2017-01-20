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
        //用super关键字调用被隐藏的父类的属性和方法
        //用this关键字调用子类的属性和方法
        super.getCount();
        this.getCount();
        return age;
    }

    public String gender = "子类属性";
//    public String getGender() {
//        return gender;
//    }
    public void method() {
        System.out.println("这是子类的method()方法"+ this.getClass());
    }

}
