package OOP.Zahnarztpraxis;


import java.time.LocalDate;
import java.util.Random;

public class Patient {
    // Attribute__________________________Definierung der Attribute, was gehört zum Patienten

    Random random = new Random();

    private int patientenNr;
    private String name;
    private String versichertenName;
    private String adresse;
    private LocalDate geburtsDatum;
    private boolean versichertenKarte;


    Patient(int patientenNr, String name, String versichertenName, String adresse, LocalDate geburtsDatum, boolean versichertenKarte) {
        this.patientenNr = patientenNr;
        this.name = name;
        this.versichertenName = versichertenName;
        this.adresse = adresse;
        this.geburtsDatum = geburtsDatum;
        this.versichertenKarte = versichertenKarte;
    }

    public int getPatientenNr() {
        return patientenNr;
    }

    public String getName() {
        return name;
    }

    public String getVersichertenName() {
        return versichertenName;
    }

    public String getAdresse() {
        return adresse;
    }

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public boolean getVersichertenKarte(boolean vorgelegt) {
        if (vorgelegt) {
            System.out.println("Ja");
            return true;
        } else {
            System.out.println("Nein");
        }
        return false;
/**
 *  return-Anweisung beendet die Methode und gibt einen Wert zurück.
 *  Alles, was nach der return-Anweisung kommt, wird nicht ausgeführt!!!
 */
    }

    public void setVersichertenName(String versichertenName) {
        this.versichertenName = versichertenName;
    }

    public void zuKrankenkasseHinzufuegen(Krankenkasse krankenkasse) {
        krankenkasse.addPatient(this);
    }

    public String toString() {
        return "\nPatientenNr: " + patientenNr +
                "\nName: " + name +
                "\nVersichertenName: " + versichertenName +
                "\nAdresse: " + adresse +
                "\nGeburtsDatum: " + geburtsDatum +
                "\nVersichertenKarte: " + versichertenKarte;
    }

}
