package inherit;

/**
 * Created by Cavan on 2017/1/19.
 */
public class Man extends Person {
    int score;
    void tellScore() {
        System.out.println("这个男人得的分数是:"+score);
    }
    int add(int x, int y) {
        return x + y;
    }
    int sub(int x, int y) {
        return x - y;
    }
}
