package sn.sdley;

import java.util.List;
import java.util.stream.Collectors;

public class ListUtils {
    public static List<String> filterNames(List<String> names) {
        return names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
    }
}
