import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Streams {

    @BeforeAll
    static void setup() {
      //setup
    }

    @DisplayName("stream")
    @Test
    void stream() {

        Stream<String> stream = Arrays.asList("a", "b", "c").stream();
        assertNotNull(stream);

        stream.forEach(e -> {
            assertTrue(!e.isEmpty());
        });
    }

    @DisplayName("streamValuesNotEmptyUsingLambdaForFunctionalInterfaceCustomer")
    @Test
    void streamValuesNotEmptyUsingLambdaForFunctionalInterfaceCustomer() {
        Stream<String> stream = Arrays.asList("a", "b", "c").stream();

        stream.forEach(e -> {
            assertNotNull(e);
            assertTrue(!e.isEmpty());
        });
    }
}
