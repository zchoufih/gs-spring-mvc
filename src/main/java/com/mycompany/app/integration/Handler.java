package com.mycompany.app.integration;

import java.io.File;

import org.springframework.integration.annotation.ServiceActivator;

public class Handler {

    @ServiceActivator
    public String handleString(File file) {
        System.out.println("Copying text: " + file.getName());
        return "input.toUpperCase()";
    }
}
