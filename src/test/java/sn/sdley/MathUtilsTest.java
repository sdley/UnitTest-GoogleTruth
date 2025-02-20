package sn.sdley;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertThrows;

public class MathUtilsTest {

    @Test
    @DisplayName("Division par zero : IllegalArgumentException")
    void testDivideByZero() {
        IllegalArgumentException thrown =
                assertThrows(IllegalArgumentException.class, () -> MathUtils.divide(4, 0));

        // Vérifie que l'exception contient bien le message attendu
        assertThat(thrown).hasMessageThat().isEqualTo("Division par zéro !");
    }

    @Test
    @DisplayName("Division Normale")
    void testNormalDivision() {
        int result = MathUtils.divide(4, 2);

        // Vérifie que 4 / 2 retourne bien 2
        assertThat(result)
                .isEqualTo(2);
    }
}
