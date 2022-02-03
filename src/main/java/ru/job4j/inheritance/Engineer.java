package ru.job4j.inheritance;

public class Engineer extends Profession {

    private int projects;

    public Engineer(String name, String surname, String birthday, String education, int projects) {
        super(name, surname, birthday, education);
        this.projects = projects;
    }

    public void smartHome(String design) {
        System.out.println("Описание чертежа " + design);
    }
}
