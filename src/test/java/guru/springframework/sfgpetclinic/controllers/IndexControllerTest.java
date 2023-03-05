package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @DisplayName("Test Proper View Name is returned for index page")
    @Test
    void index() {
        assertEquals("index", controller.index(), "Wrong View returned");
    }

    @DisplayName("Test exception")
    @Test
    void oupsHandler() {
        assertTrue("notimplemented".equals(controller.oupsHandler()), () ->
                "this is some expensive " +
                "Message to build " +
                "for my test");
    }
}