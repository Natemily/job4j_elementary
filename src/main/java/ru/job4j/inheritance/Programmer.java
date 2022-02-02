package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String position;

    public Programmer(String name, String surname, int projects, String position) {
        super(name, surname, projects);
        this.position = position;
    }

    public void programming(String script) {
        System.out.println("Составлена программа для умного дома " + script);
    }
}
