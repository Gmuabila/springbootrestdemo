package com.springrestclientdemo.springbootrestdemo;

import com.springrestclientdemo.springbootrestdemo.config.services.LongitudeLatitudeService;
import com.springrestclientdemo.springbootrestdemo.domain.LongiLatiResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class LongitudeLatitudeTest {
    RestTemplate restTemplate = new RestTemplate();

   @Autowired
   LongitudeLatitudeService longitudeLatitudeService = new LongitudeLatitudeService(restTemplate);

    @Autowired
    LongiLatiResult longiLatiResult = new LongiLatiResult();

    @Test
    public void testLongiLatitude(){

       longiLatiResult = longitudeLatitudeService.getLongitudeLat("N11BF");
       System.out.println(longiLatiResult);

    }
}
