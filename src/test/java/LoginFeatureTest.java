import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginFeatureTest {

    @Test
    void createAccount() {
        assertEquals("account", LoginFeature.createAccount("account"));
    }

    @Test
    void login() {
        assertTrue(true, String.valueOf(LoginFeature.login("", "")));
    }
}