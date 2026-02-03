package Terminal.manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public static void write(String file, String text) throws IOException {
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(text);
        }
    }

    public static List<String> read(String file) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }
}
