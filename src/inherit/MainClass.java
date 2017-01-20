package inherit;

import inherit.subsuper.Cat;
import inherit.subsuper.Child;
import inherit.subsuper.Father;
import otherinherit.Woman;

/**
 * Created by Cavan on 2017/1/19.
 */
public class MainClass {
    static public void main(String args[]) {
        int x = 12, y = 18;
        Person person = new Person();
        person.name = "zhang";
        person.gender = "man";

        Man man = new Man();
        Son son = new Son();
        System.out.println(son.add(5, 6));

        /*
        * 假如有不同的包里面含有相同的类名, 如果需要同时引用的话, 就需要在类名前加入包名
        * 如果只需要引入一个的话, 只需要import即可
        * */
        inherit.Teacher teacher1 = new inherit.Teacher();
        otherinherit.Teacher teacher2 = new otherinherit.Teacher();
        teacher1.name = "zhang"; teacher1.gender = "woman"; teacher1.age = 18;
        teacher2.name = "zhao";
        teacher2.calcul();
        System.out.println(teacher1.name +" "+ teacher2.name);

        /*
        * 当子类和父类不在同一个包中时, 子类只能继承父类中protected和public属性修饰词修饰的方法.
        * private和友好访问的对象不能被子类继承
        * */
        Woman woman = new Woman();
        woman.name = "li";
        woman.gender = "woman";

        boolean a = son instanceof Man;
        boolean b = man instanceof Son;
        System.out.println(a);
        System.out.println(b);

        /*
        * 子类声明的方法和成员变量的名字如果和从父类继承过来的名字或方法相同,
        * 就相当于对父类的成员变量或方法的重写, 父类的就会被隐藏, 但仍可被调用
        * 方法重写  */
        Cat cat = new Cat();
        cat.price = 180;
        cat.computer(8, 9);

        /*子类的继承和重写*/
        Father f1 = new Father();
        System.out.println("f1 count = "+ f1.getCount());
        f1.setCount(3);
        System.out.println("f1 count = "+ f1.getCount());

        Father f2 = new Father();
        System.out.println("f2 count = " + f2.getCount());
        f2.setCount(5);
        System.out.println("f2 count = " + f2.getCount());
        System.out.println("****************************");

        Child c = new Child();
        /*
        Father is called.   // 先调用变量原始类型的构造函数
        Child is called.    // 再调用变量被创建的类型的构造函数
        子类继承父类, 属性的数据类型可以变, 方法的数据类型不能改变
        重写时要注意:
        1.不能降低方法的访问权限
        2.不能更改方法的数据类型
        */
        System.out.println("c count = " + c.getCount());
        c.setCount(4); // Call setCount() of  Father class
        System.out.println("c count = " + c.getCount());
        System.out.println("c age = " + c.getAge());
        c.setAge(30);
        System.out.println("c age = " + c.getAge());

        /*向上转型
        * getClass(), java运行时找到当前的类
        * 在处理向上转型时, 调用的成员变量属于父类的成员变量, 方法属于子类继承或重写过来的方法
        * 如果想要调用子类的成员变量,可以将子类的成员变量封装成getter形式的方法
         * */
        Father sample = new Child();
//        sample.method();
        System.out.println("调用的成员："+sample.gender);

        /*abstract类和abstract方法
        * 用关键字abstract修饰的类称为abstract类(抽象类)
        * 用关键字abstract修饰的方法称为abstract方法(抽象方法)
        * 对于abstract方法, 只允许声明, 不允许实现
        * 不允许使用final和abstract同时修饰一个方法
        * 如果一个非抽象类是一个抽象类的子类, 则它必须重写父类的抽象方法
        * */
    }
}
