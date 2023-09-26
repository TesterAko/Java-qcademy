package at.qcademy.tasks.interfaces.aufgabe1;

public class NuetzlicheFunkionen  {

    public static Vergleichbar kleinstesElement(Vergleichbar[] elemente) {
        Vergleichbar kleinstes = elemente[0]; // Das erste Element ist das kleinste = 0

        for (int i = 1; i < elemente.length; i++) { //solange i = 1 und kleiner als Elemente Länge, soll i inkrementiert werden
            int vergleich = elemente[i].vergleichenMit(kleinstes);//vergleich das aktuelle Element mit dem kleinsten Element
            if (vergleich == -1) {// wenn das aktuelle Element kleiner als das kleinstes Element ist
                kleinstes = elemente[i]; // Aktualisiere das kleinste Element
            }
        }
        return kleinstes;
    }
}

