package research.and.development.CircuitBreaker.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kkularatne on 21/08/2017.
 */

@Service
public class RestClient {

    @HystrixCommand(fallbackMethod = "defaultValue")
    public String CallAPI(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8080/api/greeting", String.class);
    }

    private String defaultValue(){
        return "default value";
    }
}
