package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private char category;

    public Dentist(String name, String surname, int experience, char category) {
        super(name, surname, experience);
        this.category = category;
    }

    public void heal(String diagnosis) {
        System.out.println("Пациент вылечен от " + diagnosis);
    }
}
