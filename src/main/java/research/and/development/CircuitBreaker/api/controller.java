package research.and.development.CircuitBreaker.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import research.and.development.CircuitBreaker.service.RestClient;

/**
 * Created by kkularatne on 21/08/2017.
 */
@RestController
public class controller {

    @Autowired
    private RestClient restClient;

    @RequestMapping("api/getGreeting")
    public String greeting() {
        return restClient.CallAPI();
    }
}
