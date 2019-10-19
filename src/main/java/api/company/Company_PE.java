package api.company;

import api.db.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Company_PE {
    private static String SELECT = "SELECT companyID, companyName\n" +
            "FROM TARIF_ENT.COMPANY\n";

    public static List <Company_BO> getCompanyList() throws SQLException {
        List <Company_BO> companies = new ArrayList<>();
        Connection conn = ConnectionManager.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(SELECT);

        while (rs.next()) {
            companies.add(new Company_BO(rs.getLong(1), rs.getString(2)));
        }
        conn.close();

        return companies;
    }

}
