package module3.hometask.task3_1;

/**
 * Created by Mykhailo on 9/1/2016.
 */
public class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing(){
        super.sing();

    }
    void who(){
        System.out.println("I am Bird");
    }
}
