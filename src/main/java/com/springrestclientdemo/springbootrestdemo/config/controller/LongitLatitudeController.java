package com.springrestclientdemo.springbootrestdemo.config.controller;

import com.springrestclientdemo.springbootrestdemo.config.services.LongitudeLatitudeService;
import com.springrestclientdemo.springbootrestdemo.domain.LongiLatiResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LongitLatitudeController {

    LongitudeLatitudeService longitudeLatitudeService;

    public LongitLatitudeController(LongitudeLatitudeService longitudeLatitudeService) {
        this.longitudeLatitudeService = longitudeLatitudeService;
    }

    @PostMapping("/longlatitude")
    public LongiLatiResult getLongitudeLatitude(@PathVariable String postcodeIn){
        LongiLatiResult resultFromPostCodeapi = longitudeLatitudeService.getLongitudeLat(postcodeIn);

        return resultFromPostCodeapi;
    }
}
