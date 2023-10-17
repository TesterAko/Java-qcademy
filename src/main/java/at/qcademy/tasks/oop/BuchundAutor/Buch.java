package at.qcademy.tasks.oop.BuchundAutor;

public class Buch {

    private String titel;
    private String isbn;
    private double preis;
    private Autor autor;

    public Buch(String titel, String isbn, Autor autor) {
        this.titel = titel;
        this.isbn = isbn;
        this.autor = autor;
    }

        public String getTitel () {
            return titel;
        }

        public String getIsbn () {
            return isbn;
        }

        public double getPreis () {
            return preis;
        }

        public void setPreis ( double preis){
            this.preis = preis;
        }

        public Autor getAutor () {
            return autor;
        }

    public String toString() {
        return "Titel: " + titel + ", ISBN: " + isbn + ", Autor: " + autor;
    }
}

