package manager;

import java.util.ArrayList;

public class Company {
    private Boss boss;
    private ArrayList<Employee> employees;
    private ArrayList<Task> tasks;

    public Company(Boss boss, ArrayList<Employee> employees, ArrayList<Task> tasks) {
        super();
        this.boss = boss;
        this.employees = employees;
    }

    public Boss getBoss() {
        return boss;
    }

    public ArrayList<Employee> getEmployees() {
        return new ArrayList<Employee>(employees);
    }

    public void listBoss() {
        System.out.println(boss);
    }

    public void listEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
