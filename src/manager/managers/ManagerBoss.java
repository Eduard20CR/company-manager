package manager.managers;

import java.util.Scanner;

import manager.entities.Company;
import manager.helpers.MesageManager;

public class ManagerBoss {

    private Scanner s;
    private Company company;

    public ManagerBoss(Scanner s, Company company) {
        super();
        this.s = s;
        this.company = company;
    }

    public void runManager() {
        String title = "Boss manager";
        String[] options = { "Work on task", "Hire employee", "Fire employee", "Show employees", "Show employee",
                "Show tasks", "Show task", "Show company", "Make a employee the boss" };

        while (true) {
            MesageManager.printOptionTtileWithList(title, options);

        }
    }

    public void workOnTask() {

    }

    public void hireEmployee() {

    }

    public void fireEmployee(String employeeId) {

    }

    public void showEmployees() {

    }

    public void showEmployee(String employeeId) {

    }

    public void showTasks() {
    }

    public void showTask() {

    }

    public void showCompany() {

    }

    public void makeAEmployeeTheBoss(String employeeId) {

    }

}
