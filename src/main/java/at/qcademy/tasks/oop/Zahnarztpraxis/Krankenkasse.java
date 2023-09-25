package OOP.Zahnarztpraxis;

import java.util.ArrayList;

public class Krankenkasse {
    private int kassennummer;
    private String kassenname;
    private ArrayList<Patient> patienten;
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

    public ArrayList<Patient> getPatienten() {
        return patienten;
    }

    public void addPatient(Patient patient) {
        patienten.add(patient);
    }
    public String toString() {
        return ("\nKassennummer: " + kassennummer + "\nKassenname: " + kassenname + "\nPatienten: " + patienten);
    }
}


