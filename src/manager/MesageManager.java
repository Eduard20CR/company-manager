package manager;

public class MesageManager {
    static public void printOptionTtileWithList(String title, String[] options) {
        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
        }
        System.out.println("-----------");
        System.out.println("  " + title + "  ");
        System.out.println("-----------");
        System.out.println(" ");
        for (int i = 0; i < options.length; i++) {
            System.out.println(i + ". " + options[i]);
        }
        System.out.print("Enter an option: ");
    }

    static public void println(String message) {
        System.out.println(message);
    }
}
