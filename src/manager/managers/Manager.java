package manager.managers;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import manager.entities.Company;
import manager.entities.Employee;
import manager.helpers.MesageManager;
import manager.helpers.LoginManager;

public class Manager {
    private Company company;
    private Scanner s;

    public Manager(Company company, Scanner s) {
        super();
        this.company = company;
        this.s = s;

    }

    public void runManager() {
        while (true) {
            MesageManager.printOptionTtileWithList("Welcome", new String[] { "Exit", "Sign In" });
            String panelChoice = s.nextLine();
            switch (panelChoice) {
                case "0":
                    System.exit(0);
                    break;

                case "1":
                    login();
                    break;

                default:
                    System.out.print("Not valid option. Try again.");
                    break;
            }
        }
    }

    private void login() {
        LoginManager signInManager = new LoginManager(company, s);
        String[] signInResult = signInManager.login();

        if (signInResult[0] == "boss") {
            runManagerBoss();
        } else if (signInResult[0] == "employee") {
            runManagerEmployee(signInResult[1]);
        }
    }

    private void runManagerBoss() {
        ManagerBoss bossManager = new ManagerBoss(s, company);
        bossManager.runManager();
    }

    private void runManagerEmployee(String employeeId) {
        ManagerEmployee employeeManager = new ManagerEmployee(s, company, employeeId);
        employeeManager.runManager();
    }

}
