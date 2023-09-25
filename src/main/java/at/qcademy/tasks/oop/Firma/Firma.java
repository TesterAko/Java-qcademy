package OOP.Firma;

import java.util.ArrayList;
import java.util.List;

public class Firma {//Klasse erstellen
    public String name;
    public String adresse;
    public int anzahlRaeume;
    public int maxAnzahlRaeume;
    public List<Integer>  raumGroessen;
    public List<Boolean> raumBuchungen;

    // Konstruktor bauen
    public Firma(String name, String adresse, int maxAnzahlRaeume) {
        this.name = name;
        this.adresse = adresse;
        this.maxAnzahlRaeume = maxAnzahlRaeume;
        this.anzahlRaeume = 0;
        this.raumGroessen = new ArrayList<>();
        this.raumBuchungen = new ArrayList<>();
    }

    // Methoden__________________________________________________________
    // Raum hinzufügen
    public void raumHinzufügen(int plätze) {
        if (anzahlRaeume < maxAnzahlRaeume) {
            anzahlRaeume++;
        } else {
            System.out.println("Maximale Anzahl an Räumen erreicht.");
        }
    }

    //Suchen Raum
    public int sucheRaum(int sitzPlaetze) {//suche Raum implementieren
        //solange i kleiner als AnzahlRaeume ist, dann wird i erhöht
        for (int i = 0; i < anzahlRaeume; i++)
            if (!raumBuchungen.get(i) && raumGroessen.get(i) >= sitzPlaetze) {//wenn raumBuchungen nicht true und raumGroessen größer als sitzPlaetze ist
                raumBuchungen.set(i, true);//raumBuchungen wird true gesetzt
                return i + 1; // Raumnummer (beginnend bei 1)//dann wird die Raumnummer zurückgegeben
            }
        return -1; // Kein passender Raum gefunden
    }

    // Anzahl freier Räume
    public int anzahlFreiRaum() {
        int frei = 0;//kein freier Raum
        for (boolean buchung : raumBuchungen) {//solange buchung true ist
            if (!buchung) {//wenn buchung false ist
                frei++;//frei wird erhöht
            }
        }
        return frei;//frei zurückgeben
    }

    public static void main(String[] args) {
        Firma firma = new Firma("Musterfirma", "Musteradresse", 5);

        firma.raumHinzufügen(50);
        firma.raumHinzufügen(30);
        firma.raumHinzufügen(40);

        int raumNummer = firma.sucheRaum(35);
        if (raumNummer != -1) {
            System.out.println("Raum " + raumNummer + " gebucht.");
        } else {
            System.out.println("Kein passender Raum gefunden.");
        }

        System.out.println("Anzahl freier Räume: " + firma.anzahlFreiRaum());
    }
}
