package module7.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.lang.StrictMath.random;

/**
 * Generate Integer and String ArrayList and LinkedList with 1000 and 10000 elements
 * Measure time of execution of the following methods and print it to console:
 *  - add
    - set
    - get
    - remove
 */
public class Task5 {

    static void measureIntMethods(int amount, List list){
        long start = 0;
        long finish = 0;
        start = System.currentTimeMillis();
        for(int k = 0; k < amount; k++){
            int random = (int)(random()*1000);
            list.add(random);
        }
        finish = System.currentTimeMillis();
        System.out.println("add: " +  (finish - start) + " ms" );

        start = System.currentTimeMillis();
        for(int k = 0; k < amount; k++){
            list.set(k,1000);
        }
        finish = System.currentTimeMillis();
        System.out.println("set: " +  (finish - start) + " ms" );

        start = System.currentTimeMillis();
        for(int k = 0; k < amount; k++){
            list.get(k);
        }
        finish = System.currentTimeMillis();
        System.out.println("get: " +  (finish - start) + " ms" );

        start = System.currentTimeMillis();
        for(int k = 0; k < amount; k++){
            list.remove(0);
        }
        finish = System.currentTimeMillis();
        System.out.println("remove: " +  (finish - start) + " ms" );
    }
    static void measureStringMethods(int amount, List list){
        long start = 0;
        long finish = 0;
        start = System.currentTimeMillis();
        for(int k = 0; k < amount; k++){
            int random = (int)(random()*1000);
            list.add("test"+random);
        }
        finish = System.currentTimeMillis();
        System.out.println("add: " +  (finish - start) + " ms" );

        start = System.currentTimeMillis();
        for(int k = 0; k < amount; k++){
            list.set(k,"1000");
        }
        finish = System.currentTimeMillis();
        System.out.println("set: " +  (finish - start) + " ms" );

        start = System.currentTimeMillis();
        for(int k = 0; k < amount; k++){
            list.get(k);
        }
        finish = System.currentTimeMillis();
        System.out.println("get: " +  (finish - start) + " ms" );

        start = System.currentTimeMillis();
        for(int k = 0; k < amount; k++){
            list.remove(0);
        }
        finish = System.currentTimeMillis();
        System.out.println("remove: " +  (finish - start) + " ms" );
    }

    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>();
        List<String> stringArrayList = new ArrayList<>();

        List<Integer> integerLinkedList= new LinkedList<>();
        List<String> stringLinkedList = new LinkedList<>();

        int length = 1000;
        System.out.println("Measurement for "+ length + " elements Integer Array list ");
        measureIntMethods(length,integerArrayList);
        System.out.println("Measurement for "+ length + " elements Integer Linked list ");
        measureIntMethods(length,integerLinkedList);
        System.out.println("Measurement for "+ length + " elements String Array list ");
        measureStringMethods(length,stringArrayList);
        System.out.println("Measurement for "+ length + " elements String Linked list ");
        measureIntMethods(length,stringLinkedList);

        length = 10000;
        System.out.println("Measurement for "+ length + " elements Integer Array list ");
        measureIntMethods(length,integerArrayList);
        System.out.println("Measurement for "+ length + " elements Integer Linked list ");
        measureIntMethods(length,integerLinkedList);
        System.out.println("Measurement for "+ length + " elements String Array list ");
        measureStringMethods(length,stringArrayList);
        System.out.println("Measurement for "+ length + " elements String Linked list ");
        measureIntMethods(length,stringLinkedList);
    }
}
