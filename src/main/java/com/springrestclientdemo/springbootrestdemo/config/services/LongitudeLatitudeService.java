package com.springrestclientdemo.springbootrestdemo.config.services;

import com.springrestclientdemo.springbootrestdemo.config.interfaces.PostcodeInterface;
import com.springrestclientdemo.springbootrestdemo.domain.LongiLatiResult;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LongitudeLatitudeService implements PostcodeInterface {

    private RestTemplate restTemplate;

    public LongitudeLatitudeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public LongiLatiResult getLongitudeLat(String postcode) {

        String url = "https://api.postcodes.io/postcodes/" + postcode;

        LongiLatiResult apiResult = restTemplate.getForObject(url, LongiLatiResult.class);
        //ResponseEntity<LongiLatiResult> apiResult = restTemplate.getForEntity(url, LongiLatiResult.class);  //Using getForEntity() method.
        //  return apiResult.getBody();

        return apiResult;
    }
}
