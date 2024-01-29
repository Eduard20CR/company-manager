import java.util.ArrayList;
import java.util.Scanner;

import manager.Boss;
import manager.Company;
import manager.Employee;
import manager.Manager;
import manager.Task;

public class App {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Boss boss = new Boss("asdasdasd", "Oscar", "Vasquez", "user", "pass", 0, 0);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        ArrayList<Task> tasks = new ArrayList<Task>();

        Company company = new Company(boss, employees, tasks);

        Manager manager = new Manager(company, s);
        manager.runManager();
    }

}
