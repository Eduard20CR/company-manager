package manager;

import java.util.Scanner;

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
            int panelChoice = s.nextInt();

            switch (panelChoice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    signIn();
                    break;
                default:
                    System.out.print("Not valid option. Try again.");
                    break;
            }
        }
    }

    private String signIn() {
        MesageManager.println("Type username (Just numbers):");
        String username = s.next();
        MesageManager.println("Type password:");
        String password = s.next();

        // isBoss
        if (company.getBoss().signIn(username, password)) {
            MesageManager.println("I am a boss");
            return "boss";
        }
        // isEmployee
        company.getEmployees().stream().filter(e -> e.signIn(username, password));
        MesageManager.println("I am a employee");

        // Not found
        MesageManager.println("Not found");
        return "";
    }

}
