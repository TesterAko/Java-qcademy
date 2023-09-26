package at.qcademy.tasks.interfaces.aufgabe2;

public class Verschluesselung {
    public static String verschluesseln(String klartext, Chiffrierung schluessel) {
        StringBuilder verschluesselterText = new StringBuilder();//verschlüsselter Text wird in einen StringBuilder gespeichert
        for (char zeichen : klartext.toCharArray()) {//solange zeichen in klartext vorhanden sind wird er durchlaufen
            verschluesselterText.append(schluessel.chiffrieren(zeichen));//zeichen wird mit der chiffrierung ausgegeben
        }
        return verschluesselterText.toString();
    }

    public static String entschluesseln(String geheimtext, Chiffrierung schluessel) {
        StringBuilder entschluesselterText = new StringBuilder();//entschlüsselter Text wird in einen StringBuilder gespeichert
        for (char zeichen : geheimtext.toCharArray()) {// solange zeichen in geheimtext vorhanden sind wird er durchlaufen
            entschluesselterText.append(schluessel.dechiffrieren(zeichen));// zeichen wird mit der dechiffrierung ausgegeben
        }
        return entschluesselterText.toString();
    }
}

