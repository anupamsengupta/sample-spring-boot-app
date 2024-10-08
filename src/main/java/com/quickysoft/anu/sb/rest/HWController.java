package com.quickysoft.anu.sb.rest;
import com.quickysoft.anu.sb.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class HWController {
    private RestTemplate restTemplate;
    private AppConfig appConfig;

    @Autowired
    public HWController(RestTemplate restTemplate, AppConfig appConfig) {
        this.restTemplate = restTemplate;
        this.appConfig = appConfig;
    }

    @GetMapping("/greet")
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<>("Greetings!", HttpStatus.OK);
    }

    @GetMapping("/external-api")
    public ResponseEntity<String> externalAPI() {
        return new ResponseEntity<>("external API Greetings!", HttpStatus.OK);
    }

    @GetMapping("/get-external-data1")
    public ResponseEntity<String> getExternalData1() {
        String apiUrl = appConfig.getExternalApiUrl1();
        System.out.println("apiUrl 1 - " + apiUrl);

        // Call the external API and get the response as a String
        ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);

        // Return the response body
        return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
    }

    @GetMapping("/get-external-data2")
    public ResponseEntity<String> getExternalData2() {
        String apiUrl = appConfig.getExternalApiUrl2();
        System.out.println("apiUrl 2 - " + apiUrl);

        // Call the external API and get the response as a String
        ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);

        // Return the response body
        return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
    }
}
