package caom.aman0.openai.openaiapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private ApiService apiService;
    @GetMapping("/a")
    public String testApi(){
        return apiService.testapi("d");
    }
}
