package com.marco.testapi;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "test-service")
public interface ServiceClient {

    @RequestMapping(value = "/get/instance/info", method = RequestMethod.GET)
    String getInstanceInfo();

}
