package module11.homework;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * You should create method which replace words in the File and write result to existing File content
 * a) read file, save to string var
 * b) replace words
 * c) add string to the existing file content
 * File fileContentMerger(Map<String, String> map)
 */
public class Task3 {
    public static void main(String[] args) {
        String inPath = "src/module11/homework/input.txt";
        String outPath = "src/module11/homework/output.txt";
        WorkFile workFile = new WorkFile(inPath,outPath);

        // replace parameters
        Map<String, String> replaceTo = new HashMap<String, String>(){
            {
                put("replace","AAAAAAAAAAAA");
            }
        };

        try{
            workFile.fileContentMerger(replaceTo);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
