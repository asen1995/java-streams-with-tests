import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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


    @DisplayName("sequentialStreamUseSameThreadTest")
    @Test
    void sequentialStreamUseSameThreadTest() {
        final List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);

        final Set<String> uniqueThreads = new HashSet<>();
        listOfNumbers.stream().forEach(number ->
                uniqueThreads.add(Thread.currentThread().getName())
        );

        assertTrue(uniqueThreads.size() == 1);
    }


    @DisplayName("parallelStreamsUseMoreThenOneThread")
    @Test
    void parallelStreamsUseMoreThenOneThread() {
        final List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);

        final Set<String> uniqueThreads = new HashSet<>();

        listOfNumbers.parallelStream().forEach(number ->
                uniqueThreads.add(Thread.currentThread().getName())
        );

        assertTrue(uniqueThreads.size() != 1);
    }
}
