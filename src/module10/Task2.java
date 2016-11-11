package module10;

/**
 * Created by Mykhailo on 11/11/2016.
 * Create your own exception class using the extends keyword.
 * Write a constructor for this class that takes a String argument and stores it inside the object with a String reference.
 * Write a method that prints out the stored String. Create a try-catch clause to exercise your new exception.
 */
public class Task2 {
    private class MyOwnException extends Exception{
        private String message;
        void printExceptionMessage(){
            System.out.println(message);
        }

        MyOwnException(String m){
            message = m;
        }
    }

    private void test(String m) {
        try{
            throw new MyOwnException(m);
        }
        catch (MyOwnException e){
            e.printExceptionMessage();
        }

    }

    public static void main(String[] args) {
        Task2 pleaseWork = new Task2();
        pleaseWork.test("another random error");
    }




}
