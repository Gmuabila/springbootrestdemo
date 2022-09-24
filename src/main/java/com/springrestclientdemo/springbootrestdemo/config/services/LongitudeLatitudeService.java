package com.springrestclientdemo.springbootrestdemo.config.services;

import com.springrestclientdemo.springbootrestdemo.config.interfaces.PostcodeInterface;
import com.springrestclientdemo.springbootrestdemo.domain.LongiLatiResult;
import com.sun.jndi.toolkit.url.Uri;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class LongitudeLatitudeService implements PostcodeInterface {

    private RestTemplate restTemplate;
    private String api_url;

    public LongitudeLatitudeService(RestTemplate restTemplate, @Value("${postcode.apiurl}") String api_url) {
        this.restTemplate = restTemplate;
        this.api_url = api_url;
    }

    public LongiLatiResult getLongitudeLat(String postcode) {
            UriComponentsBuilder uriBuilder = UriComponentsBuilder
                    .fromUriString(api_url)
                    .path(postcode);
                   //.queryParam("postcode", postcode);

//        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString(api_url);
//        uriBuilder.buildAndExpand(postcode).toUri();


//        UriComponents uriBuilder = UriComponentsBuilder.newInstance()
//                .scheme("https").host("api.postcodes.io")
//                .path("/postcodes/").query("q={keyword}").buildAndExpand(postcode);


//           .scheme("http").host("www.google.com")
//                .path("/").query("q={keyword}").buildAndExpand("baeldung");

//        UriComponents uriBuilder = UriComponentsBuilder.newInstance()
//                .fromUriString(api_url).queryParam(postcode).build();
//        // .scheme("http").host("www.baeldung.com").path("/junit-5").build();
////        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString(api_url)
////                .queryParam("postcode", postcode);



        //String url = "https://api.postcodes.io/postcodes/" + postcode;

        LongiLatiResult apiResult = restTemplate.getForObject(uriBuilder.toUriString(), LongiLatiResult.class);
        //ResponseEntity<LongiLatiResult> apiResult = restTemplate.getForEntity(url, LongiLatiResult.class);  //Using getForEntity() method.
        //  return apiResult.getBody();

        return apiResult;
    }
}
