import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class StreamFilter {


    @BeforeAll
    static void setup() {
        //setup
    }

    @DisplayName("streamFilterByCriteriaMinNumber")
    @Test
    public void streamFilterByCriteriaMinNumber() {

        List<Object> objects = Arrays.asList(5, 2, 7, 10, 600, "asen", "peter", 660, 44);

        Integer minNumber = 10;

        List<Object> data = objects.stream()
                .filter(object -> object instanceof Integer)
                .filter(number -> (Integer) number > minNumber).sorted()
                .collect(Collectors.toList());

        data.forEach(number -> {
            assertTrue(number instanceof Integer);
            assertTrue((Integer) number > minNumber);
        });
    }


}
