package src;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainJavaTest {

    @Test
    public void longestWord() {

        String s = MainJava.LongestWord("The cow jumped over the moon");
        assertEquals("jumped", s);
        assertEquals(6, s.length());

    }


}