package at.qcademy.tasks.oop.Zahnarztpraxis;

import java.util.ArrayList;
import java.util.List;

public class Krankenkasse {
    private int kassennummer;
    private String kassenname;
    private List<Patient> patienten;
    public Krankenkasse(int kassennummer, String kassenname) {
        this.kassennummer = kassennummer;
        this.kassenname = kassenname;
        this.patienten = new ArrayList<>();
    }

    public int getKassennummer() {
        return kassennummer;
    }

    public String getKassenname() {
        return kassenname;
    }

    public List<Patient> getPatienten() {
        return (List<Patient>) patienten;
    }

    public void addPatient(Patient patient) {
        patienten.add(patient);
    }
    public String toString() {
        return ("\nKassennummer: " + kassennummer + "\nKassenname: " + kassenname + "\nPatienten: " + patienten);
    }
}


