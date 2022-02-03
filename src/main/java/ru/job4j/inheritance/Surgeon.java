package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private char medicalId;

    public Surgeon(String name, String surname, String birthday, String education, int experience, char medicalId) {
        super(name, surname, birthday, education, experience);
        this.medicalId = medicalId;
    }

    public void operation(String diagnosis) {
        System.out.println("Пациент прооперирован " + diagnosis);
    }
}
