package module11.homework;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by Mykhailo on 11/14/2016.
 */
public class WorkFile {

    private File inputFile;
    private File outputFile;

    /**
     * Assign different output and input files
     * @param inputFile
     * @param outputFile
     */
    public WorkFile(File inputFile, File outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    /**
     * Assign one file for input and output
     * @param file
     */
    public WorkFile(File file){
       this(file, file);
    }

    /**
     * Assign one file for input and output based on path
     * @param path
     */
    public WorkFile(String path){
        this( new File(path), new File(path));
    }

    /**
     * Assign one file for input and output based on path
     * @param inPath input file path
     * @param outPath output file path
     */
    public WorkFile(String inPath, String outPath){
        this( new File(inPath), new File(outPath));
    }



    /**
     * read inputFile and save to String array
     * @return String with text from file
     */

    public String readFile() throws IOException {
        String buffer = new String(Files.readAllBytes( inputFile.toPath() ), StandardCharsets.UTF_8 );
        return buffer;
    }

    /**
     * write string to the outputFile
     */
    public void writeFile(String text) throws IOException{
        Files.write( outputFile.toPath() , text.getBytes());
    }

    /**
     * add string to the outputFile
     */
    public void addToFile(String text)throws IOException{

        Files.write( outputFile.toPath() , text.getBytes(), StandardOpenOption.APPEND );
    }

    /**
     * Read inputFile and return string with replaced words based on map
     * @param map (KEY word to be replaced -> VALUE word replaced to)
     * @throws IOException
     */
    public String replacer(Map<String, String> map) throws IOException{

        String result = readFile();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            result = result.replaceAll("\\b"+entry.getKey()+"\\b",entry.getValue());
        }
        return result;
    }

    /**
     * Read inputFile and write text with replaced words(based on map) to outputFile
     * @param map: KEY word to be replaced -> VALUE word replaced to
     * @return outputFile
     * @throws IOException
     */
    public File fileContentReplacer(Map<String, String> map)throws IOException{
        String text = replacer(map);
        writeFile(text);
        return outputFile;
    }

    /**
     * Replace words in the inputFile and add result to existing outputFile content
     * @param map: KEY word to be replaced -> VALUE word replaced to
     * @return outputFile
     * @throws IOException
     */
    public File fileContentMerger(Map<String, String> map) throws IOException{
        String text = replacer(map);
        addToFile(text);
        return outputFile;
    }

    /**
     * Counts quantity(case insensetive) of searched word in inputFile
     * @param searchWord
     * @return Print number of times searchWord repeated in the file, 0 if wasn't found
     * @throws IOException
     */
    public int countWord (String searchWord) throws IOException {

        Pattern pattern = Pattern.compile("(?i)\\b"+searchWord+"\\b");
        Matcher matcher = pattern.matcher(readFile());
        int count = 0;

        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public File getInputFile() {
        return inputFile;
    }

    public File getOutputFile() {
        return outputFile;
    }

    public void setInputFile(File inputFile) {
        this.inputFile = inputFile;
    }

    public void setOutputFile(File outputFile) {
        this.outputFile = outputFile;
    }
}
