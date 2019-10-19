package api.company;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class CompanyPersistenceController {

    @RequestMapping("/company")
    public List<Company_BO> getCompanyList() {
        List <Company_BO> result;
        try {
            result = Company_PE.getCompanyList();
        } catch (SQLException se) {
            result = null;
            se.printStackTrace();
        }

        return result;
    }
}
