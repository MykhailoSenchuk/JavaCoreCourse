package module2.hometask;

/**
 * Created by Mykhailo on 8/29/2016.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] values = {0, -20, -5, -4, -5, -4, 0,0,0,0};
        System.out.println("Sum is " + sum(values));
        System.out.println("Min is " + min(values));
        System.out.println("Max is " + max(values));
        System.out.println( ( maxPositive(values) != 0 ) ? ( "Max positive is " + maxPositive(values) ) : "There are no positive numbers");
        System.out.println("Multiplication is " + multiplication(values) );
        if(values[values.length - 1] != 0)
            System.out.println("modulus of first and last element is " + modulus(values) );
        else
            System.out.println("modulus:Division by zero");
        System.out.println("Second largest is " + secondLargest(values) );
    }

    public static int sum(int array[]) {
        int sum = 0;
        for(int item : array) {
            sum += item;
        }
        return sum;
    }
    public static double sum(double array[]) {
        double sum = 0;
        for(double item : array) {
            sum += item;
        }
        return sum;
    }
    public static int min(int array[]) {
        int min = array[0];
        for(int item : array) {
            if(item < min)
                min = item;
        }
        return min;
    }
    public static double min(double array[]) {
        double min = array[0];
        for(double item : array) {
            if(item < min)
                min = item;
        }
        return min;
    }
    public static int max(int array[]) {
        int max = array[0];
        for(int item : array)
            if(item > max)
                max = item;
        return max;
    }
    public static double max(double array[]) {
        double max = array[0];
        for(double item : array)
            if(item > max)
                max = item;
        return max;
    }
    public static int maxPositive(int array[]) {
        boolean anyPositive = false;

        for(int item : array) {
            if(item > 0) {
                anyPositive = true;
                break;
            }
        }
        if(anyPositive)
            return max(array);
        else
            return 0;
    }
    public static double maxPositive(double array[]) {
        boolean anyPositive = false;

        for(double item : array) {
            if(item > 0) {
                anyPositive = true;
                break;
            }
        }
        if(anyPositive)
            return max(array);
        else
            return 0;
    }
    public static double multiplication(double array[]){
        double multiplication = 1;
        for(double item : array) {
            multiplication *= item;
        }
        return multiplication;
    }
    public static int multiplication(int array[]){
        int multiplication = 1;
        for(int item : array) {
            multiplication *= item;
        }
        return multiplication;
    }
    public static int modulus(int array[]){
        return array[0] % array[array.length - 1];
    }
    public static double modulus(double array[]){
        return array[0] % array[array.length - 1];
    }
    //descending sort
    public static void sort( int array[] ) {
        boolean swap = true;
        int buffer = 0;
        while (swap) {
        swap = false;
            for(int i = 0;  i < array.length - 1;  i++) {
                if ( array[i] < array[i+1] ) {
                    buffer = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buffer;
                    swap = true;
                    }
                }
            }
        }
    //descending sort
    public static void sort( double array[] ) {
    boolean swap = true;
    double buffer = 0;
    while (swap) {
        swap = false;
        for(int i = 0;  i < array.length - 1;  i++) {
            if ( array[i] < array[i+1] ) {
                buffer = array[i];
                array[i] = array[i+1];
                array[i+1] = buffer;
                swap = true;
            }
        }
    }
    }
    public static int secondLargest(int array[]){
        sort(array);//receive descending array
        int i;
        //go through descending array starting from second element(skipping max element)
        // to find second largest number
        for(i = 1;  i < array.length;  i++) {
            if(array[i] != array [i-1]){
                break;
            }
        }
        return array[i];
    }
    public static double secondLargest(double array[]){
        sort(array);//receive descending array
        int i;
        //go through descending array starting from second element(skipping max element)
        //to find second largest element
        for(i = 1;  i < array.length;  i++) {
            if(array[i] != array [i-1]){
                break;
            }
        }
        return array[i];
    }
}