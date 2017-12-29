package com.marco.testapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @Autowired
    private ServiceClient client;

    @GetMapping("/get/instance/info")
    public String getInstanceInfo() {
        String s = client.getInstanceInfo();
        log.info(s);
        return s;
    }

}
