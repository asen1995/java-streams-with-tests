import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static com.sun.javafx.fxml.expression.Expression.equalTo;
import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimeoutTest {

    @DisplayName("timeout5SecondsMaxTest")
    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void timeout5SecondsMaxTest() throws InterruptedException {
        Integer tenSeconds = 10_000;
        Thread.sleep(tenSeconds);
    }
}
