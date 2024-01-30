import java.util.ArrayList;
import java.util.Scanner;

import manager.entities.Boss;
import manager.entities.Company;
import manager.entities.Employee;
import manager.entities.Task;
import manager.managers.Manager;

public class App {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Boss boss = new Boss("id1", "Oscar", "Vasquez", "boss", "pass", 0, 0);

        Employee employee1 = new Employee("id2", "Oscar", "Vasquez", "user1", "pass", 0, 0);
        Employee employee2 = new Employee("id3", "Oscar", "Vasquez", "user2", "pass", 0, 0);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);

        ArrayList<Task> tasks = new ArrayList<Task>();

        Company company = new Company(boss, employees, tasks);

        Manager manager = new Manager(company, s);
        manager.runManager();
    }

}
