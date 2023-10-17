package at.qcademy.tasks.oop.BuchundAutor;

public class Autor {
        public String name;
        public String synonym;
        public double gage;

        Autor (String name, String synonym, double gage) {
            this.name = name;
            this.synonym = synonym;
            this.gage = gage;
        }
        @Override
        public String toString() {
            return "{Name:"  + name + " Synonym: " + synonym + " Gage: " + gage + "}";
        }
    }


