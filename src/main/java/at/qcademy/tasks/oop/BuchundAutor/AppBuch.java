package at.qcademy.tasks.oop.BuchundAutor;



public class AppBuch {

    public static void main(String[] args) {
        Bibliothek bibliothek = new Bibliothek();
        Buch buch1 = new Buch("Titel1", "ISBN1", new Autor("Max Mustermann", "Muster", 20));
        Buch buch2 = new Buch("Titel2", "ISBN2", new Autor("Maria Musterfrau", "Musterfrau", 25));
        Buch buch3 = new Buch("Titel3", "ISBN3", new Autor("Ekrem Gedik", "ako", 50));


        Autor autor = new Autor("Ako R", "Ako", 50);

        System.out.println(autor.toString());
        System.out.println(buch1.toString());
        System.out.println(buch2.toString());
        System.out.println(buch3.toString());

        bibliothek.buchHinzufuegen(buch1);//um Methode im Main auszuführen Klassenname.Methodenname(Produktklasse);
        bibliothek.buchHinzufuegen(buch3);

        bibliothek.buchZurueckGeben(buch2);
        bibliothek.buchLoeschen("Titel1");//Ausleihen mit String titel selbst eingeben
        bibliothek.buchAusleihen("Titel2");

    }
}

