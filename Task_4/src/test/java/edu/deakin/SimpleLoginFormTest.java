package edu.deakin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleLoginFormTest {

    SimpleLoginForm form = new SimpleLoginForm();

    @Test
    public void testValidUsernameAndPassword_returnsSuccess() {
        assertEquals("success", form.login("admin", "password123"));
    }

    @Test
    public void testValidUsernameInvalidPassword_returnsFail() {
        assertEquals("fail", form.login("admin", "wrongpass"));
    }

    @Test
    public void testInvalidUsernameValidPassword_returnsFail() {
        assertEquals("fail", form.login("wronguser", "password123"));
    }

    @Test
    public void testInvalidUsernameAndPassword_returnsFail() {
        assertEquals("fail", form.login("wronguser", "wrongpass"));
    }

    @Test
    public void testValidUsernameNullPassword_returnsError() {
        assertEquals("error", form.login("admin", null));
    }

    @Test
    public void testNullUsernameValidPassword_returnsError() {
        assertEquals("error", form.login(null, "password123"));
    }

    @Test
    public void testNullUsernameAndPassword_returnsError() {
        assertEquals("error", form.login(null, null));
    }

    @Test
    public void testEmptyUsernameAndPassword_returnsFail() {
        assertEquals("fail", form.login("", ""));
    }
}
