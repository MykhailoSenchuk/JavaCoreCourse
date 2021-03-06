package module11.homework;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * You should create method which replace words in the File and rewrite File content with new values
 * a) read file, save to string var
 * b) replace words
 * c) rewrite file with string
 * File fileContentReplacer(Map<String, String> map)
 */
public class Task2 {
    public static void main(String[] args) {

        String inPath = "src/module11/homework/input.txt";//input file
        String outPath = "src/module11/homework/output.txt";//output file
        WorkFile workFile = new WorkFile(inPath,outPath);

        // replace parameters
        Map<String, String> replaceTo = new HashMap<String, String>(){
            {
                put("replace","AAAAAAAAA");
            }
        };

        try{
            workFile.fileContentReplacer(replaceTo);//reult can be found in output file
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
