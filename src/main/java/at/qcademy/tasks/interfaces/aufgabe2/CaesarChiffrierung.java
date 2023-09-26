package at.qcademy.tasks.interfaces.aufgabe2;

class CaesarChiffrierung implements Chiffrierung {
    //Interface definiert zwei Methoden: chiffrieren und dechiffrieren.

    private int verschiebung;

    public CaesarChiffrierung(int verschiebung) {
        this.verschiebung = verschiebung;//Konstruktor-Deklaration int Wert zur Verschiebung von Buchstaben
    }

    @Override
    public char chiffrieren(char zeichen) {
        if (Character.isLowerCase(zeichen)) {
            return (char) ('a' + (zeichen - 'a' + verschiebung) % 26);
            //Mechanismus Caesar Chiffrierung
            //der Wert wird aus Schritt 1 durch 26 modulo (Restwert nach der Division) genommen.
            // Dies bewirkt, dass der Wert in den Bereich von 0 bis 25 zurückgebracht
           // der Index wird aus Schritt 2 zum Zeichen 'a' hinzugefügt,
            // um das ursprüngliche Kleinbuchstaben-Zeichen in das verschlüsselte Zeichen umzuwandeln
        } else {
            return zeichen; // Zeichen außerhalb der Kleinbuchstaben bleiben unverändert
        }
    }

    @Override //und hier umgekehrt
    public char dechiffrieren(char zeichen) {
        if (Character.isLowerCase(zeichen)) {
            return (char) ('a' + (zeichen - 'a' - verschiebung + 26) % 26);
        } else {
            return zeichen; // Zeichen außerhalb der Kleinbuchstaben bleiben unverändert
        }
    }
}

