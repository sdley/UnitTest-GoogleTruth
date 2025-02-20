package sn.sdley;

import com.google.common.truth.Truth;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        // Initialisation avant chaque test
        person = new Person("Alice", 30);
    }

    @AfterEach
    void tearDown() {
        // Nettoyage après chaque test
        person = null;
    }

    @Test
    @DisplayName("getName() = 'Alice'")
    void testGetNameReturnsAlice() {
        Truth.assertWithMessage("Erreur : getName() ne retourne pas 'Alice'.")
                .that(person.getName())
                .isEqualTo("Alice");
    }

    @Test
    @DisplayName("getAge() > 20")
    void testGetAgeIsGreaterThan20() {
        Truth.assertWithMessage("Erreur : getAge() devrait être supérieur à 20.")
                .that(person.getAge())
                .isGreaterThan(20);
    }
}
