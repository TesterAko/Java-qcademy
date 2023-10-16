package at.qcademy.tasks.oop.BuchundAutor;

import java.util.ArrayList;
import java.util.List;

public class Bibliothek {

    public List<Buch> buchListe;
    public Buch buch;

    public Bibliothek() {
        buchListe = new ArrayList<>();
    }

    //Methoden________________________________________________________________
    public void buchHinzufuegen(Buch buch) {
        buchListe.add(buch);//buch wird hinzugefügt
        System.out.println("Buch mit Titel " + buch.titel + " wurde hinzugefügt.");
    }

    public void buchAusleihen(String titel) {
        for (Buch buch : buchListe) {
            /**Enhanced for-Schleife" Sie wird verwendet, um über die Elemente einer Sammlung (in diesem Fall buchListe) zu iterieren.
             durchläuft automatisch alle Elemente der Liste und weist jedem Element den Namen buch zu.
             Sie bietet eine einfachere und leserlichere Möglichkeit, durch eine Sammlung zu iterieren,
             als eine herkömmliche for-Schleife mit einem Zähler.**/
            if (buch.getTitel().equals(titel)) {//wenn der Buch mit dem Namen aus der Liste gefunden wird, wird dieser ausgeliehen
                buchListe.remove(buch);//entfernung des Buches
                System.out.println("Buch mit Titel " + titel + " ausgeliehen.");
                return;//return bedeutet, dass die Methode abgebrochen wird
            }
        }
        System.out.println("Buch mit Titel " + titel + "nicht gefunden.");
    }


    public void buchZurueckGeben(Buch buch) {
        buchListe.add(buch);//buch wird zurückgegeben
        System.out.println("Buch mit Titel " + buch.titel + " zurückgegeben.");

    }

    public void buchLoeschen(String titel) {
        for (Buch buch : buchListe) {//Solange ein Buch mit dem Namen aus der Liste gefunden wird, wird dieser entfernt
            /**Enhanced for-Schleife" Sie wird verwendet, um über die Elemente einer Sammlung (in diesem Fall buchListe) zu iterieren.
             durchläuft automatisch alle Elemente der Liste und weist jedem Element den Namen buch zu.
             Sie bietet eine einfachere und leserlichere Möglichkeit, durch eine Sammlung zu iterieren,
             als eine herkömmliche for-Schleife mit einem Zähler.**/
            if (buch.getTitel().equals(titel)) {//wenn der Buch mit dem Namen aus der Liste gefunden wird, wird dieser entfernt
                buchListe.remove(buch);
                System.out.println("Buch mit Titel " + titel + " gelöscht.");
                return;
            }
        }
        System.out.println("Buch mit Titel " + titel + " nicht gefunden.");
    }


}



