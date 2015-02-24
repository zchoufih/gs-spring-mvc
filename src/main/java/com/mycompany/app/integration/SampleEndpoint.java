package com.mycompany.app.integration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.util.StreamUtils;

@MessageEndpoint
public class SampleEndpoint {

    @ServiceActivator
    public String hello(File file) throws IOException {
        FileInputStream in = new FileInputStream(file);
        String name = new String(StreamUtils.copyToByteArray(in));
        in.close();

        return name;
    }
}
