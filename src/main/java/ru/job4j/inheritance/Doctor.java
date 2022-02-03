package ru.job4j.inheritance;

public class Doctor extends Profession {

    private int experience;

    public Doctor(String name, String surname, String birthday, String education, int experience) {
        super(name, surname, birthday, education);
        this.experience = experience;
    }

    public void diagnosis(String pacientName) {
        System.out.println("Диагноз пациента: " + pacientName);
    }
}
