package module6.homework;

/**
 * Create ArraysUtils with following methods

 sum(int array[])
 min(int array[])
 max(int array[])
 maxPositive(int array[])
 multiplication  (int array[])
 modulus(int array[])
 secondLargest(int array[])

 these should be just copied from your HW2.

 In addition add new methods

 int[] reverse(int[] array)
 int[] findEvenElements(int[] array)

 Make sure nobody can inherit your ArraysUtils.


 */

public final class ArraysUtils {

    public final static int sum(int array[]) {
        int sum = 0;
        for(int item : array) {
            sum += item;
        }
        return sum;
    }
    public final static int min(int array[]) {
        int min = array[0];
        for(int item : array) {
            if(item < min)
                min = item;
        }
        return min;
    }
    public final static int max(int array[]) {
        int max = array[0];
        for(int item : array)
            if(item > max)
                max = item;
        return max;
    }
    public final static int maxPositive(int array[]) {
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
    public final static int multiplication(int array[]){
        int multiplication = 1;
        for(int item : array) {
            multiplication *= item;
        }
        return multiplication;
    }
    public final static int modulus(int array[]){
        if( array[array.length - 1] != 0 )
            return array[0] % array[array.length - 1];
        else {
            System.out.println("modulus:Division by zero");
            return 2147483647;//max integer  value
        }
    }
    //descending sort
    public final static int[] sort( int array[] ) {

        int[] result = new int[array.length];
        //copy the array to leave it unchanged
        for (int i =0; i < array.length; i++){
            result[i] = array[i];
        }

        boolean swap = true;
        int buffer = 0;
        while (swap) {
            swap = false;
            for(int i = 0;  i < result.length - 1;  i++) {
                if ( result[i] < result[i+1] ) {
                    buffer = result[i];
                    result[i] = result[i+1];
                    result[i+1] = buffer;
                    swap = true;
                }
            }
        }
        return result;
    }
    public final static int secondLargest(int array[]){
        int[] descending = sort(array);//receive descending array
        int i;
        //go through descending array starting from second element(skipping max element)
        // to find second largest number
        for(i = 1;  i < descending.length;  i++) {
            if(descending[i] != descending [i-1]){
                break;
            }
        }
        return descending[i];
    }
    public final static int[] reverse(int[] array){
        int[] result = new int[array.length];
        int resultIndex = 0;

        for (int i = array.length; i > 0; i--) {
            result[resultIndex] = array[i - 1];
            resultIndex++;
        }

        return result;
    }
    public final static int[] findEvenElements(int[] array){
        int[] resultBuffer = new int[array.length];
        int[] result;
        int resultIndex = 0;

        for (int item: array) {
            if( item % 2 == 0){
                resultBuffer[resultIndex] = item;
                resultIndex ++;
            }
        }

        result = new int[resultIndex];
        for(int i = 0; i < resultIndex; i++){
            result[i] = resultBuffer[i];
        }

        return result;
    }
    public final static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(i != (array.length -1) ? array[i] + ", " : array[i] + "\n" );
        }
    }
    public final static void printArray(long[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(i != (array.length -1) ? array[i] + ", " : array[i] + "\n" );
        }
    }
}
