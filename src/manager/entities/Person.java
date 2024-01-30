package manager.entities;

import manager.helpers.MesageManager;

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
        return username.equals(usernameSignUp) && password.equals(passwordSignUp);
    }

    public String getId() {
        return id;
    }
}
