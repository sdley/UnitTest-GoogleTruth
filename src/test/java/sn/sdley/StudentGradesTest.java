package sn.sdley;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.google.common.truth.Truth.assertThat;

public class StudentGradesTest {

    @Test
    @DisplayName("'Alice' a une note de 18")
    void testAliceGrade() {
        Map<String, Integer> grades = StudentGrades.getGrades();

        assertThat(grades)
                .containsEntry("Alice", 18);
    }

    @Test
    @DisplayName("'Bob' a une note supérieure à 10")
    void testBobGradeGreaterThan10() {
        Map<String, Integer> grades = StudentGrades.getGrades();

        assertThat(grades.get("Bob"))
                .isGreaterThan(10);
    }

    @Test
    @DisplayName("Map contient exactement 3 éléments")
    void testMapSize() {
        Map<String, Integer> grades = StudentGrades.getGrades();

        assertThat(grades)
                .hasSize(3);
    }
}
