package module10;

/**
 * Created by Mykhailo on 11/11/2016.
 *
 * Create three new types of exceptions.
 * Write a class with a method that throws all three.
 * In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
 */
public class Task5 {

    class ExceptionOne extends Exception{}
    class ExceptionTwo extends Exception{}
    class ExceptionThree extends Exception{}

    void throwExceptions()throws ExceptionOne,ExceptionTwo, ExceptionThree{
        for(int i = 0; i < 3; i++){
            if(i == 0) throw new ExceptionOne();
            if(i == 1) throw new ExceptionTwo();
            if(i == 2) throw new ExceptionThree();
        }
    }

    public static void main(String[] args) {
        Task5 pleaseWork = new Task5();
        try{
            pleaseWork.throwExceptions();
        }
        catch(Exception e){
            System.out.println("works as intended?");
        }
    }
}
