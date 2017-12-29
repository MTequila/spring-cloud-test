package com.marco.testservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/get/instance/info")
    public String getInstanceInfo() throws UnknownHostException {
        String host = InetAddress.getLocalHost().getHostName();
        return String.format("%s:%s", host, port);
    }

}
