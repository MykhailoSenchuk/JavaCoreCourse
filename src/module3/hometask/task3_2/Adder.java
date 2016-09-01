package module3.hometask.task3_2;

/**
 * Created by Mykhailo on 9/1/2016.
 */
public class Adder extends Arithmetic {
    public Adder(int a, int b) {
        super(a,b);
    }
    boolean check(Integer a, Integer b) {
        if(a >= b)
            return true;
        return false;
    }
}
