package caom.aman0.openai.openaiapi;

import org.springframework.stereotype.Service;

@Service
public class ApiService {
    public String testapi(String x){
        return x+x;
    }
}
