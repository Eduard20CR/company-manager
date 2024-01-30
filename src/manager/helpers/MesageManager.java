package manager.helpers;

public class MesageManager {
    static public void printOptionTtileWithList(String title, String[] options) {
        printSpacing();

        String titleDash = "";
        int titleDashAmount = title.length() + 4;
        for (int i = 0; i < titleDashAmount; i++) {
            titleDash = titleDash.concat("-");
        }

        System.out.println(titleDash);
        System.out.println("  " + title + "  ");
        System.out.println(titleDash);
        System.out.println(" ");

        for (int i = 0; i < options.length; i++) {
            System.out.println(i + ". " + options[i]);
        }
        System.out.print("Enter an option: ");
    }

    static public void println(String message) {
        System.out.println(message);
    }

    static public void println(String[] message) {
        printSpacing();
        System.out.print("Array print: ");
        for (String string : message) {
            System.out.print(" " + string + " -");
        }
        System.out.println("");
    }

    static public void printSpacing() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
        }
    }

    static public void printSpacing(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println(" ");
        }
    }
}
