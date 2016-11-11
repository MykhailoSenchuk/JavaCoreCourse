package module10;

/**
 * Created by Mykhailo on 11/11/2016.
 *
 * Create three new types of exceptions.
 * Write a class with a method that throws all three.
 * In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
 */
public class Task5 {

    private class ExceptionOne extends Exception{}
    private class ExceptionTwo extends Exception{}
    private class ExceptionThree extends Exception{}

    private void throwExceptions(int i)throws ExceptionOne,ExceptionTwo, ExceptionThree{
        if(i == 1) throw new ExceptionOne();
        if(i == 2) throw new ExceptionTwo();
        if(i == 3) throw new ExceptionThree();

    }

    public static void main(String[] args) {
        Task5 pleaseWork = new Task5();
        try{
            pleaseWork.throwExceptions(1);
        }
        catch(Exception e){
            System.out.println("works as intended?");
        }
    }
}
