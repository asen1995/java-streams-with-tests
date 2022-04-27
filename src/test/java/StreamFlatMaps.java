import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StreamFlatMaps {
    @BeforeAll
    static void setup() {
        //setup
    }

    @DisplayName("flatMapUnitTest")
    @Test
    public void flatMapUnitTest() {

        final List<String> letters1 = Arrays.asList("a", "b");
        final List<String> letters2 = Arrays.asList("b", "c", "d");
        final List<String> letters3 = Arrays.asList("e", "f");
        final List<List<String>> listOfLetters = Arrays.asList(letters1, letters2, letters3);

        final List<String> flatList = listOfLetters.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        final List<String> resultExpected = Arrays.asList("a", "b", "b", "c", "d", "e", "f");

        assertArrayEquals(flatList.toArray(), resultExpected.toArray());

    }
}
