package at.qcademy.tasks.oop.Person;

import java.time.LocalDate;

public class Person {

    public static int mindestGeburtsjahr = 1990;//static attribute

    private String vorname;
    private String nachname;
    LocalDate geburtsDatum;
    double gewicht;

     public Person(String vorname, String nachname, LocalDate geburtsDatum, double gewicht) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
        this.gewicht = gewicht;
    }

    Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    Person(String nachname) {
        this.nachname = nachname;
    }

    public int alter() {
        int jetzigesJahr = LocalDate.now().getYear();
        int geburtsJahr = geburtsDatum.getYear();
        return jetzigesJahr - geburtsJahr;
    }

    public void zunahme(double kg) {
        gewicht += kg;
    }


   @Override
    public String toString() {
        return "{\"vorname\": \"" + vorname + "\", \"nachname\": \"" + nachname + "\", \"gewicht\": " + gewicht + ", \"geburtsDatum\": \"" + geburtsDatum + "\"};";
    }

    public void abnahme(double kg) {
        gewicht -= kg;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String setVorname(String vorname) {
        return vorname = vorname;

    }
}