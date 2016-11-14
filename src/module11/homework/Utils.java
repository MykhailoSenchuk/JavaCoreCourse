package module11.homework;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Mykhailo on 11/14/2016.
 */
public class Utils {

    /**
     * read file to string
     */
    public static String readFile(File file) throws IOException {
        String buffer = "";
        try(FileInputStream in = new FileInputStream(file)){
            int b;
            while(( b = in.read() ) != -1) {
                buffer = buffer + (char) b;
            }
        }

        return buffer;
    }

    public static String readFile(String path) throws IOException {
        String buffer = "";
        File file = Paths.get(path)
                .toFile();
        try(FileInputStream in = new FileInputStream( file )){
            int b;
            while(( b = in.read() ) != -1 ) {
                buffer = buffer + (char) b;
            }
        }

        return buffer;
    }

    /**
     * write string to a file
     */
    public static File writeFile(String text, String path) throws IOException{
        File file = Paths.get(path)
                .toFile();
        try(PrintWriter out = new PrintWriter ( file )){
            out.print(text);
        }
        return file;
    }

    /**
     * write string to the default output file
     */
    public static File writeFile(String text) throws IOException{
        File file = Paths.get("src/module11/homework/output.txt")
                .toFile();
        try(PrintWriter out = new PrintWriter ( file )){
            out.print(text);
        }
        return file;
    }

    /**
     * add string to a file
     */
    public static File addToFile(String text, String path)throws IOException{

        File file = Paths.get(path)
                .toFile();
        try(PrintWriter out = new PrintWriter ( new FileOutputStream(file, true) )){
            out.append(text);
        }

        return file;
    }
    /**
     * add string to the default output file
     */
    public static File addToFile(String text)throws IOException{

        File file = Paths.get("src/module11/homework/output.txt")
                .toFile();
        try(PrintWriter out = new PrintWriter ( new FileOutputStream(file, true) )){
            out.append(text);
        }

        return file;
    }



    /**
     * Read file and replace words based on map
     * @param map (KEY word to be replaced -> VALUE word replaced to)
     * @param file input file
     */
    public static String replacer(Map<String, String> map, File file) throws IOException{
        String result = null;

        // receive distinct words from file
        String[] words = readFile(file)
                .split(" ");

        // replace words
        for (int i = 0; i < words.length; i++) {
            String replaceFor = map.get(words[i]);
            if(replaceFor != null){
                words[i] = replaceFor;
            }
        }

        //join words and return
        return result.join(" ",words);
    }

    /**
     * Read file and replace words based on map
     *
     * @param map (KEY word to be replaced -> VALUE word replaced to)
     * @param path input file path
     */
    static String replacer(Map<String, String> map, String path) throws IOException{
        String result = null;

        // receive distinct words from file
                String[] words = readFile( path )
                .split(" ");

        // replace words
        for (int i = 0; i < words.length; i++) {
            String replaceFor = map.get(words[i]);
            if(replaceFor != null){
                words[i] = replaceFor;
            }
        }

        //join words and return
        return result.join(" ",words);
    }

    static File fileContentReplacer(Map<String, String> map, String path)throws IOException{
        String text = replacer(map,path);
        return writeFile(text,path);
    }
    static File fileContentMerger(Map<String, String> map, String path)throws IOException{
        String text = replacer(map,path);
        return addToFile(text,path);
    }

    static int countWord (String searchWord, String path) throws IOException {

        int count = 0;

        // receive distinct words from file
        String[] words = readFile(path)
                .split(" ");

        //search for the word
        for (String word : words) {
            String pureWord = word.replaceAll("[^A-Za-z]+", "");
            if (pureWord == null)
                continue;
            if (pureWord.equalsIgnoreCase(searchWord))
                count++;
        }
        return count;
    }

}
