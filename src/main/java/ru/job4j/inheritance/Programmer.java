package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String githubAccount;

    public Programmer(String name, String surname, String education, String birthday, int engineersLicenseNumber) {
        super(name, surname, education, birthday, engineersLicenseNumber);
        this.githubAccount = githubAccount;
    }

    public String getGithubAccount() {
        return githubAccount;
    }

    public void commit(Program program) {

    }

    public void push(Program program) {

    }
}
