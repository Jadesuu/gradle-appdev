import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessagingFeatureTest {

    @Test
    void send() {
        assertEquals("Hello", MessagingFeature.send("Hello"));
    }

    @Test
    void receive() {
        assertEquals("Hello", MessagingFeature.receive("Hello"));
    }
}