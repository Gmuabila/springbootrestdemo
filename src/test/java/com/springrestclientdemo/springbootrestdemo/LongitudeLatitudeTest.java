package com.springrestclientdemo.springbootrestdemo;

import com.springrestclientdemo.springbootrestdemo.config.services.LongitudeLatitudeService;
import com.springrestclientdemo.springbootrestdemo.domain.LongiLatiResult;
import javafx.application.Application;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LongitudeLatitudeTest {

    @Autowired
    ApplicationContext applicationContext;
    WebTestClient webTestClient;
    @Autowired
    RestTemplate restTemplate = new RestTemplate();
    @Value("{postcode.apiurl}")
    String api_url;

   @Autowired
   LongitudeLatitudeService longitudeLatitudeService = new LongitudeLatitudeService(restTemplate, api_url);
   LongiLatiResult longiLatiResult = new LongiLatiResult();

   @Before
   public void setup() throws Exception {
       webTestClient = WebTestClient.bindToApplicationContext(applicationContext).build();
   }

    @Test
    public void testLongiLatitude(){
//        webTestClient.post().uri("/longlatitude")
//                .contentType(MediaType.ALL)
//                .body(BodyInserters.fromValue("N1 1BF"))
//                .exchange()
//                .expectStatus().isOk();

        longiLatiResult = longitudeLatitudeService.getLongitudeLat("N11BF");
       System.out.println(longiLatiResult);

    }
}
