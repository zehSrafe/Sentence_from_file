import be.intec.data.ReadFile;
import be.intec.service.SentenceChecker;

public class Main {
    public static void main(String[] args) {
        SentenceChecker sentenceChecker = new SentenceChecker();

        sentenceChecker.findFullSentences();
    }
}
