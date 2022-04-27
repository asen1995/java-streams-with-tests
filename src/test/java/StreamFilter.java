import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public final class StreamFilter {


    @BeforeAll
    static void setup() {
        //setup
    }

    @DisplayName("streamFilterByCriteriaBiggerThenMinNumber")
    @Test
    public void streamFilterByCriteriaBiggerThenMinNumber() {

        final List<Object> objects = Arrays.asList(5, 2, 7, 10, 600, "asen", "peter", 660, 44);

        final Integer minNumber = 10;

        final List<Object> data = objects.stream()
                .filter(object -> object instanceof Integer)
                .filter(number -> (Integer) number > minNumber).sorted()
                .collect(Collectors.toList());

        data.forEach(number -> {
            assertTrue(number instanceof Integer);
            assertTrue((Integer) number > minNumber);
        });
    }

    @DisplayName("streamFilterByCriteriaString")
    @Test
    public void streamFilterByCriteriaString() {

        final List<Object> objects = Arrays.asList(5, 2, 7, 10, 600, "asen", "peter", 660, 44);

        final Integer minNumber = 10;

        final List<Object> data = objects.stream()
                .filter(object -> object instanceof String)
                .collect(Collectors.toList());

        data.forEach(number -> {
            assertTrue(number instanceof String);
        });

        assertTrue(data.size() == 2);
    }

    @DisplayName("streamFilterByCriteriaBiggerFindMinNumber")
    @Test
    public void streamFilterByCriteriaBiggerFindMinNumber() {

        final List<Object> objects = Arrays.asList(5, 2, 7, 10, 600, "asen", "peter", 660, 44);

        Optional<Integer> minNumber = objects.stream()
                .filter(obj -> obj instanceof Integer)
                .map(obj -> (Integer) obj)
                .sorted()
                .findFirst();

        assertTrue(minNumber.isPresent() && minNumber.get() == 2);

    }
}
