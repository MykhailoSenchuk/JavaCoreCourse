package module10;

/**
 * Created by Mykhailo on 11/11/2016.
 * Define an object reference and initialize it to null.
 * Try to call a method through this reference.
 * Now wrap the code in a try-catch clause to catch the exception.
 */
public class Task3 {
    class NullClass{
        void someMethod(){}
    }
    public static void main(String[] args) {
        NullClass test = null;
        try {
            test.someMethod();
        }
        catch (NullPointerException e){
            System.out.println("I'm working!!");
        }

    }
}
