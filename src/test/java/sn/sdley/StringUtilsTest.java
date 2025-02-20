package sn.sdley;

import com.google.common.truth.Truth;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    @DisplayName("Conversion en majuscules")
    public void testToUpperCase() {
        // Vérifie que "java" devient "JAVA"
        String result = StringUtils.toUpperCase("java");
        Truth.assertWithMessage("Erreur : La conversion en majuscule de 'java' a échoué.")
                .that(result)
                .isEqualTo("JAVA");
    }

    @Test
    @DisplayName("Chaîne contenant une sous-chaîne")
    public void testStringContains() {
        // Vérifie que "Test" contient "es"
        Truth.assertWithMessage("Erreur : 'Test' ne contient pas 'es'.")
                .that("Test")
                .contains("es");
    }

    @Test
    @DisplayName("Test début et fin d'une chaîne")
    public void testStringStartsAndEnds() {
        // Vérifie que "Hello" commence par "He"
        Truth.assertWithMessage("Erreur : 'Hello' ne commence pas par 'He'.")
                .that("Hello")
                .startsWith("He");

        // Vérifie que "Hello" finit par "o"
        Truth.assertWithMessage("Erreur : 'Hello' ne finit pas par 'o'.")
                .that("Hello")
                .endsWith("o");
    }
}
