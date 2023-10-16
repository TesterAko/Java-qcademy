package at.qcademy.tasks.oop.Person;

import java.time.LocalDate;

public class Person {

    public static int mindestGeburtsjahr = 1990;//static attribute

    private String vorname1;
    private String nachname;
    LocalDate geburtsDatum;
    double gewicht;

    public Person(String vorname, String nachname, double gewicht, LocalDate geburtsDatum) {
        this.vorname1 = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
        this.gewicht = gewicht;
    }

    Person(String vorname, String nachname, LocalDate geburtsDatum) {
        this(vorname, nachname, 0, geburtsDatum);
    }

    Person(String vorname, String nachname) {
        this(vorname, nachname, null);
    }

    Person(String nachname) {
        this(null, nachname);
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
        return "{\"vorname\": \"" + vorname1 + "\", \"nachname\": \"" + nachname + "\", \"gewicht\": " + gewicht + ", \"geburtsDatum\": \"" + geburtsDatum + "\"};";
        //wenn ich ausgabe in Json will
    }

    public void abnahme(double kg) {
        gewicht -= kg;
    }

    public String getVorname() {
        return vorname1;
    }

    public String getNachname() {
        return nachname;
    }

    public String setVorname(String vorname) {
        return vorname1 = vorname;

    }
}