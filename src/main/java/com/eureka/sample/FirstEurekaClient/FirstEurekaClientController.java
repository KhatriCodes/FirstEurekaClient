package com.eureka.sample.FirstEurekaClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FirstEurekaClientController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/firstEurekaClient")
    public String Display()
    {
        ResponseEntity<String> responce = restTemplate.getForEntity("http://SecondEurekaClient/secondClient", String.class);
        return  responce.getBody();
    }
}
