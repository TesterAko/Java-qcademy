package at.qcademy.tasks.oop.Zahnarztpraxis;

import java.time.LocalDate;

public class AppZahnarztpraxis {

    public static void main(String[] args) {

        // erstellung Krankenkassen
        Krankenkasse k1 = new Krankenkasse(1, "Krankenkasse 1");
        Krankenkasse k2 = new Krankenkasse(2, "Krankenkasse 2");
        Krankenkasse k3 = new Krankenkasse(3, "Krankenkasse 3");

        // Erstellung Patienten + hinzufügen zur Krankenkasse
        Patient p1 = new Patient(1, "Hans", "Muster", "Max Musterstrasse 1", LocalDate.of(1995, 1, 1), true);
        p1.zuKrankenkasseHinzufuegen(k1);

        Patient p2 = new Patient(2, "Peter", "Mann", "Max Mädchenstrasse 2", LocalDate.of(1976, 1, 1), true);
        p2.zuKrankenkasseHinzufuegen(k1);

        Patient p3 = new Patient(3, "Susi", "Mädchen", "Max Mädchenstrasse 3", LocalDate.of(1997, 1, 1), true);
        p3.zuKrankenkasseHinzufuegen(k3);

        System.out.println(p1.toString());
        System.out.println(k1.toString());



    }
}
