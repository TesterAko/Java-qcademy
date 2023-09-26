package at.qcademy.tasks.interfaces.aufgabe1;

import static at.qcademy.tasks.interfaces.aufgabe1.NuetzlicheFunkionen.kleinstesElement;

public class Aufgabe1Main {
        public static void main(String[] args) {
            Vinteger[] vIntegers = {
                    //ein Array von VInteger-Objekten erstellt und initialisiert. Diese Objekte haben unterschiedliche Werte.
                    new Vinteger(5),
                    new Vinteger(2),
                    new Vinteger(8),
                    new Vinteger(99),
                    new Vinteger(10)
            };
            Vergleichbar kleinstes = kleinstesElement(vIntegers);
            //kleinstesElement aus der Klasse NuetzlicheFunktionen wird aufgerufen, um das kleinste Element im Array zu finden
            //vergleicht die Vergleichbar-Objekte im Array mithilfe der vergleichenMit-Methode, die in der VInteger-Klasse implementiert ist
            System.out.println("Das kleinste Element hat den Wert: " + ((Vinteger) kleinstes).getWert());
            //Ergebnis des Vergleichs, das als Vergleichbar-Objekt zurückgegeben wird, wird in der Variable kleinstes gespeichert
            //getWert-Methode aus der VIntegar-Klasse extrahiert und auf der Konsole ausgegeben
        }
    }

