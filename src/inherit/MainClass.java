package inherit;
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
        System.out.println(man.height);
        Son son = new Son();
        System.out.println(son.add(5, 6));
        System.out.println(son.height);

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
    }
}
