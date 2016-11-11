package module10;

/**
 * Created by Mykhailo on 11/11/2016.
 * Create a class with two methods, f( ) and g( ).
 * In g( ), throw an exception of a new type that you define.
 * In f( ), call g( ), catch its exception and, in the catch clause, throw a different exception (of a second type that you define).
 * Test your code in main( ).
 */
public class Task4 {
    private class ExceptionOne extends Exception{}
    private class ExceptionTwo extends Exception{}

    private void f() throws ExceptionTwo{
        try{
            g();
        }
        catch (ExceptionOne e){
            throw new ExceptionTwo();
        }
    }
    private void g()throws ExceptionOne {
        throw new ExceptionOne();
    }

    public static void main(String[] args) {
        Task4 pleaseWork = new Task4();
        try{
            pleaseWork.f();
        }
        catch(ExceptionTwo e){
            System.out.println("works as intended?");
        }
    }

}
