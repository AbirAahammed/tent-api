package api.driver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverPersistenceController {

    @RequestMapping("/driver")
    public Driver_BO drivers() {
        return new Driver_BO(1L, "Ab", "loin", null);
    }
}
