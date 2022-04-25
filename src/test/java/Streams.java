import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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
    }
}
