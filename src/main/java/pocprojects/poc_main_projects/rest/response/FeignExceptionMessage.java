package pocprojects.poc_main_projects.rest.response;

import lombok.Data;

@Data
public class FeignExceptionMessage {
    private String timestamp;
    private int status;
    private String error;
    private String message;
    private String path;
}
