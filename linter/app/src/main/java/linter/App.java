/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\C-ROAD\\IdeaProjects\\java-fundamentals\\linter\\resources\\gates.js"); // Update this with the correct file path
        List<String> errorMessages = checkSemicolons(filePath);

        for (String errorMessage : errorMessages) {
            System.out.println(errorMessage);
        }

    }

    public static List<String> checkSemicolons(Path filePath) {
        List<String> errors = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty() || line.endsWith("{") || line.endsWith("}") || line.contains("if ") || line.contains("else")) {
                    lineNumber++;
                    continue;
                }

                if (!line.endsWith(";")) {
                    errors.add("Line " + lineNumber + ": Missing semicolon.");
                }

                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return errors;
    }
}
