package module11.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.sun.javafx.fxml.expression.Expression.add;

/**
 * Created by Mykhailo on 11/12/2016.
 * You should create method which replace words in the File and returns String with replaced values
 * a) read file, save to string var
 * b) replace words
 * c) return new string
 * String replacer(Map<String, String> map)
 */
public class Task1 {
    public static void main(String[] args) {
        String inPath = "src/module11/homework/Task";

        Map<String, String> replaceTo = new HashMap<String, String>() {
            {
                put("file", "bitch");
            }
        };

        try {
            System.out.println(Utils.replacer(replaceTo, inPath));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}