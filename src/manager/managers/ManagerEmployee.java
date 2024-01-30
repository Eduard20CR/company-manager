package manager.managers;

import java.util.Scanner;

import manager.entities.Company;
import manager.helpers.MesageManager;

public class ManagerEmployee {
    private Scanner s;
    private Company company;
    private String employeeId;

    public ManagerEmployee(Scanner s, Company company, String employeeId) {
        super();
        this.s = s;
        this.company = company;
        this.employeeId = employeeId;
    }

    public void runManager() {
        MesageManager.println("Welcome employee");
    }
}
