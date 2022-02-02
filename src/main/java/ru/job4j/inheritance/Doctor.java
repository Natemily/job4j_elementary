package ru.job4j.inheritance;

public class Doctor extends Profession {

    private int experience;

    public Doctor(String name, String surname, int experience) {
        super(name, surname);
        this.experience = experience;
    }

    public void diagnosis(String pacientName) {
        System.out.println("Диагноз пациента: " + pacientName);
    }
}
