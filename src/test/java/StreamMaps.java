import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class StreamMaps {

    @BeforeAll
    static void setup() {
        //setup
    }

    @DisplayName("mapEveryStringFromStreamAndInvokeUpperCase")
    @Test
    public void mapEveryStringFromStreamAndInvokeUpperCase() {

        final List<String> upperCaseInit = Arrays.asList("A", "B", "C");

        final List<String> upperCaseListAfterMap = Stream.of("a", "b", "c")
                .map(String::toUpperCase).collect(Collectors.toList());
        assertNotNull(upperCaseListAfterMap);

        assertArrayEquals(upperCaseInit.toArray(), upperCaseListAfterMap.toArray());

    }

}
