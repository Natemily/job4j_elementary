package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private char medicalId;

    public Surgeon(String name, String surname, int experience, char medicalId) {
        super(name, surname, experience);
        this.medicalId = medicalId;
    }

    public void operation(String diagnosis) {
        System.out.println("Пациент прооперирован " + diagnosis);
    }
}
