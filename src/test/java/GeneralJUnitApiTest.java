import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertSame;

public class GeneralJUnitApiTest {

    @BeforeAll
    static void setup() {
        //setup
    }
    @DisplayName("assertSameTest")
    @Test
    public void assertSameTest() {
        final List<Object> objects = Arrays.asList(5, 2, 7, 10, 600, "asen", "peter", 660, 44);
        final List<Object> objectSecondPointer = objects;

        assertSame(objects,objectSecondPointer);

    }
}
