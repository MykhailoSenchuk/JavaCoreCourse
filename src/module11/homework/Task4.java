package module11.homework;

import java.io.IOException;

/**
 * Check if file contains particular word. Pring 0 if no. Print number n which equals number of times it is contained in the file
 * a) read file, save to string var
 * b) calculate how many time the word occurs
 * c) print result
 * int checkWord(String word)
 *
 * Write this task with usual try and try with resources (two versions)
 */
public class Task4 {
    public static void main(String[] args) {

        String path = "src/module11/homework/input.txt";
        WorkFile workFile = new WorkFile(path);
        String searchWord = "file";
        try{
            System.out.println("Word " + '\''+searchWord+'\'' + " occure " + workFile.countWord(searchWord) + " times in the file");
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
