package sn.sdley;

import com.google.common.truth.Truth;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testToUpperCase() {
        // Vérifie que "java" devient "JAVA"
        String result = StringUtils.toUpperCase("java");
        Truth.assertThat(result).isEqualTo("JAVA");
    }

    @Test
    public void testStringContains() {
        // Vérifie que "Test" contient "es"
        Truth.assertThat("Test").contains("es");
    }

    @Test
    public void testStringStartsAndEnds() {
        // Vérifie que "Hello" commence par "He" et finit par "o"
        Truth.assertThat("Hello").startsWith("He");
        Truth.assertThat("Hello").endsWith("o");
    }
}
