package sn.sdley;

import com.google.common.truth.Truth;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class ListUtilsTest {

    private List<String> input;
    private List<String> result;

    @BeforeEach
    public void setUp() {
        // Initialisation de la liste avant chaque test
        input = Arrays.asList("Alice", "Bob", "Anna");
        result = ListUtils.filterNames(input);
    }

    @AfterEach
    public void tearDown() {
        // Nettoyage après chaque test
        input = null;
        result = null;
    }

    @Test
    @DisplayName("Liste retournée contient 'Alice' et 'Anna'")
    public void testFilterNamesContainsAliceAndAnna() {
        Truth.assertWithMessage("Erreur : La liste filtrée ne contient pas 'Alice' et 'Anna'.")
                .that(result)
                .containsAtLeast("Alice", "Anna");
    }

    @Test
    @DisplayName("Liste ne contient pas 'Bob'")
    public void testFilterNamesDoesNotContainBob() {
        Truth.assertWithMessage("Erreur : La liste filtrée ne devrait pas contenir 'Bob'.")
                .that(result)
                .doesNotContain("Bob");
    }

    @Test
    @DisplayName("Liste contient exactement 2 éléments")
    public void testFilterNamesHasExactlyTwoElements() {
        Truth.assertWithMessage("Erreur : La liste filtrée ne contient pas exactement 2 éléments.")
                .that(result)
                .hasSize(2);
    }
}
