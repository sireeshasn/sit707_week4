package edu.deakin;

public class SimpleLoginForm {
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";

    public String login(String username, String password) {
        if (username == null || password == null) {
            return "error";
        }

        if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
            return "success";
        } else {
            return "fail";
        }
    }
}
