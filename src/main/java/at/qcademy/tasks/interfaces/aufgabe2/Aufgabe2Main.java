package at.qcademy.tasks.interfaces.aufgabe2;

import static at.qcademy.tasks.interfaces.aufgabe2.Verschluesselung.entschluesseln;
import static at.qcademy.tasks.interfaces.aufgabe2.Verschluesselung.verschluesseln;

public class Aufgabe2Main {
    public static void main(String[] args) {
        // Beispiel für die Caesar-Verschiebung mit einer Verschiebung von Index Wert 3 Buchstaben
        CaesarChiffrierung caesarSchluessel = new CaesarChiffrierung(5);
        String klartext = "hello";
        String verschluesselterText = verschluesseln(klartext, caesarSchluessel);
        String entschluesselterText = entschluesseln(verschluesselterText, caesarSchluessel);
        System.out.println("Klartext: " + klartext);
        System.out.println("Verschlüsselter Text: " + verschluesselterText);
        System.out.println("Entschlüsselter Text: " + entschluesselterText);

        // Beispiel für die benutzerdefinierte Chiffrierung mit einem benutzerdefinierten Geheimtextalphabet
        char[] benutzerdefiniertesAlphabet = "xyzabcdefghijklmnopqrstuvw".toCharArray();
        BenutzerdefinierteChiffrierung benutzerdefinierterSchluessel = new BenutzerdefinierteChiffrierung(benutzerdefiniertesAlphabet);
        klartext = "hello";
        verschluesselterText = verschluesseln(klartext, benutzerdefinierterSchluessel);
        entschluesselterText = entschluesseln(verschluesselterText, benutzerdefinierterSchluessel);
        System.out.println("Klartext: " + klartext);
        System.out.println("Verschlüsselter Text: " + verschluesselterText);
        System.out.println("Entschlüsselter Text: " + entschluesselterText);
    }
}
