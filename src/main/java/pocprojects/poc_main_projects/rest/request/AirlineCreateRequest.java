package pocprojects.poc_main_projects.rest.request;

import lombok.Data;

import java.math.BigInteger;

@Data
public class AirlineCreateRequest {
    private BigInteger id;
    private String name;
    private String country;
    private String logo;
    private String slogan;
    private String head_quaters;
    private String website;
    private String established;
}
