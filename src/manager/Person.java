package manager;

public class Person {
    private String id;
    private String name;
    private String lastName;
    private String username;
    private String password;
    private int partyTimes;
    private int workTimes;

    public Person(String id, String name, String lastName, String username, String password, int partyTimes,
            int workTimes) {
        super();
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.partyTimes = partyTimes;
        this.workTimes = workTimes;

    }

    public boolean signIn(String usernameSignUp, String passwordSignUp) {
        MesageManager.println("usernameSignUp: " + usernameSignUp);
        MesageManager.println("passwordSignUp: " + passwordSignUp);
        MesageManager.println("this.username: " + this.username);
        MesageManager.println("this.password: " + this.password);
        System.out.println(username.equals(usernameSignUp));
        System.out.println(password.equals(passwordSignUp));
        return username.equals(usernameSignUp) && password.equals(passwordSignUp);
    }
}
