package be.intec.service;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SentenceCheckerTest {
    @Test
    void sentenceToFindTest() {
        SentenceChecker sentenceChecker = new SentenceChecker();

        sentenceChecker.findFullSentences();
        assertEquals("this is my full sentence", sentenceChecker.getSentenceToFind());
    }

    @Test
    void allLinesFromFileTest() throws IOException {
        SentenceChecker sentenceChecker = new SentenceChecker();
        List<String> expectedList = List.of("this is my full sentence", "this is my", "trash",
                "sentence", "yess", "this is my full", "full sentence", "full");

        sentenceChecker.setAllLines();
        assertThat(sentenceChecker.getAllLines(), is(expectedList));
    }

    @Test
    void printFileContentTest() {
        final BooleanWrapper methodIsCalled = new BooleanWrapper(false);

        SentenceChecker sentenceChecker = new SentenceChecker() {
            @Override
            public void printFileContent() {
                methodIsCalled.setValue(true);
            }
        };

        sentenceChecker.findFullSentences();
        assertTrue(methodIsCalled.getValue());
    }
}