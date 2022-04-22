package be.intec.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private List<String> linesFromFile = new ArrayList<>();

    public List<String> readLinesFromFile() throws IOException {
        File file = new File("src/main/resources/sentences.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String nextLine;

        while ((nextLine = bufferedReader.readLine()) != null) {
            linesFromFile.add(nextLine);
        }

        bufferedReader.close();
        return linesFromFile;
    }
}
