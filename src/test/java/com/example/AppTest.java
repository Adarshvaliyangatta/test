package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testMessage() {
        App app = new App();

        assertEquals(
            "Hello! Maven CI/CD Pipeline",
            app.getMessage()
        );
    }
}
