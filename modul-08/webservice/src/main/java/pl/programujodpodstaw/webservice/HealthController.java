package pl.programujodpodstaw.webservice;

import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("health")
    public ResponseEntity<ApplicationStatus> checkHealth() {
//        return new ResponseEntity<>("OK", HttpStatus.OK);

        return ResponseEntity.ok(new ApplicationStatus(1));
    }
}
