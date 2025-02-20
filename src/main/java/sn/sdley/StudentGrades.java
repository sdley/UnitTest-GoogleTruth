package sn.sdley;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    public static Map<String, Integer> getGrades() {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Alice", 18);
        grades.put("Bob", 15);
        grades.put("Charlie", 10);
        return grades;
    }

}
