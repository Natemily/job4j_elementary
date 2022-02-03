package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private char category;

    public Dentist(String name, String surname, String birthday, String education, int experience, char category) {
        super(name, surname, birthday, education, experience);
        this.category = category;
    }

    public void heal(String diagnosis) {
        System.out.println("Пациент вылечен от " + diagnosis);
    }
}
