package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String function;

    public Builder(String name, String surname, String birthday, String education, int projects, String function) {
        super(name, surname, birthday, education, projects);
        this.function = function;
    }

    public void building(String plan) {
        System.out.println("Построен умный дом " + plan);
    }
}
