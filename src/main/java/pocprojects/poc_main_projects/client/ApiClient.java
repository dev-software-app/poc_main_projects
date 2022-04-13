package pocprojects.poc_main_projects.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pocprojects.poc_main_projects.config.CustomFeignClientConfiguration;
import pocprojects.poc_main_projects.rest.response.Airline;

import java.util.List;

@FeignClient(value = "${api.rest.name}", url = "${api.rest.url}", configuration = CustomFeignClientConfiguration.class)
public interface ApiClient {

    @RequestMapping(method = RequestMethod.GET, value = "/airlines")
    List<Airline> readAirLines();

    @RequestMapping(method = RequestMethod.GET, value = "/airlines/{airlineId}")
    Airline readAirLineById(@PathVariable("airlineId") String airlineId);

}
