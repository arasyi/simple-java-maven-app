package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getMessage());
    }

    public String getMessage() {
        return MESSAGE;
    }

    public void setMessage(String message) {
        MESSAGE = message;
    }
}
