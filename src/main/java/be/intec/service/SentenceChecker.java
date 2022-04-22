package be.intec.service;

import be.intec.data.ReadFile;

import java.io.IOException;
import java.util.List;

public class SentenceChecker {
    private ReadFile readFile = new ReadFile();
    private List<String> allLines;
    private String sentenceToFind;

    public void findFullSentences() {
        try {
            setAllLines();
            printFileContent();
            setSentenceToFind();

            for (int i = 0; i < allLines.size(); i++) {
                for (String line : allLines) {
                    if ((allLines.get(i) + " " + line).equals(sentenceToFind)) {
                        System.out.println("Found: " + (allLines.get(i) + " + " + line));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setSentenceToFind() {
        this.sentenceToFind = allLines.get(0);
        allLines.remove(0);

        System.out.println("Sentence to find: " + this.sentenceToFind);
    }

    public String getSentenceToFind() {
        return this.sentenceToFind;
    }

    public List<String> getAllLines() {
        return this.allLines;
    }

    public void setAllLines() throws IOException {
        this.allLines = readFile.readLinesFromFile();
    }

    public void printFileContent() {
        System.out.println("Content of provided document:");
        allLines.forEach(System.out::println);
        System.out.println("\n");
    }
}
