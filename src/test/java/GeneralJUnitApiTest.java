import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GeneralJUnitApiTest {

    @DisplayName("assertSame")
    @Test
    public void assertSame() {
        final List<Object> objects = Arrays.asList(5, 2, 7, 10, 600, "asen", "peter", 660, 44);
        final List<Object> objectSecondPointer = objects;

        assertSame(objects,objectSecondPointer);

    }
}
