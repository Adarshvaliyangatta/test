package com.example;

public class App {

    public String getMessage() {
        return "Hello! Maven CI/CD Pipeline";
    }

    public static void main(String[] args) {

        App app = new App();

        System.out.println(app.getMessage());
        System.out.println("Java application executed successfully.");
    }
}
