package at.qcademy.tasks.oop.Person;




import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person Ekrem = new Person("Ekrem", "Gedik", LocalDate.of(1992, 12,25), 95);

        System.out.println("Das Alter von Ekrem ist " + Ekrem.alter());

        Ekrem.zunahme(5);
        System.out.println("Das Gewicht von Ekrem beträgt aktuell " + Ekrem.gewicht);//danach wird es addiert in der Instanzvariable gewicht zusammengezählt

        Ekrem.abnahme(30);
        System.out.println("Das Gewicht von Ekrem beträgt aktuell " + Ekrem.gewicht);


        Person Ako = new Person("Ako", "Reshwanzadeh", LocalDate.of(1992,12,25), 95);

        Person John = new Person("John", "Deere");
        System.out.println("Das Geburtsdatum von John ist " + John.geburtsDatum);


        System.out.println(Ekrem.toString());

        System.out.println(Ekrem.getVorname());


        Ekrem.zunahme(10);

        System.out.println(Ekrem.setVorname("Ako"));
    }
}
