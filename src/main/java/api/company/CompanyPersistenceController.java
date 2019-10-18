package api.company;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyPersistenceController {

    @RequestMapping("/company")
    public Company_BO getCompanyList() {
        return new Company_BO(1L, "Eluma Corp");
    }
}
