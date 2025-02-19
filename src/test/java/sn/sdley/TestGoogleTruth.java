package sn.sdley;

import static com.google.common.truth.Truth.*;
import org.junit.jupiter.api.Test;

public class TestGoogleTruth {

    @Test
    void testInstallation() {
        String message = "Google Truth fonctionne!";
        assertThat(message).isNotNull();
        assertThat(message).isEqualTo("Google Truth fonctionne!");
    }

}
