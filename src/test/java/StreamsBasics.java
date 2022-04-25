import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StreamsBasics {

    @BeforeAll
    static void setup() {
      //setup
    }

    @DisplayName("stream")
    @Test
    void stream() {

        final Stream<String> stream = Arrays.asList("a", "b", "c").stream();
        assertNotNull(stream);

        stream.forEach(e -> {
            assertTrue(!e.isEmpty());
        });
    }

    @DisplayName("streamValuesNotEmptyUsingLambdaForFunctionalInterfaceCustomer")
    @Test
    void streamValuesNotEmptyUsingLambdaForFunctionalInterfaceCustomer() {
        final Stream<String> stream = Arrays.asList("a", "b", "c").stream();

        stream.forEach(e -> {
            assertNotNull(e);
            assertTrue(!e.isEmpty());
        });
    }
}
