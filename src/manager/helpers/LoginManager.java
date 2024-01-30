package manager.helpers;

import java.util.Scanner;

import manager.entities.Company;
import manager.entities.Employee;

public class LoginManager {

    private Company company;
    private Scanner s;

    public LoginManager(Company company, Scanner s) {
        super();
        this.company = company;
        this.s = s;
    }

    public String[] login() {

        MesageManager.println("Type username:");
        String username = s.next();
        MesageManager.println("Type password:");
        String password = s.next();
        String[] notFound = { "" };

        // isBoss
        if (company.getBoss().signIn(username, password)) {
            String[] boss = { "boss" };
            return boss;
        }

        // isEmployee
        for (Employee e : company.getEmployees()) {
            if (e.signIn(username, password)) {
                String[] employee = { "employee", e.getId() };
                return employee;
            }
        }

        // Not found
        MesageManager.println("Not found");
        return notFound;
    }
}
