package at.qcademy.tasks.oop.AbstrakteKlasseUebung;

public interface BeschleunigbarAuto {

    public void autoBeschleunigen();

    public void autoFaehrt();

    public void autoBremst();
}



//___________________Interfaces_________________________________
/**Interface ist eine spezielle Art von abstrakter Klasse,
 * bei der alle Methoden automatisch abstrakt und öffentlich sind,
 * und alle Felder automatisch als public, static und final behandelt werden.
 *
 * Definiert, welche Methoden eine Klasse implementieren muss,
 * aber es selbst enthält keine konkreten Implementierungen dieser Methoden
 *
 * Dient als Vertrag, der von Klassen implementiert wird, um sicherzustellen,
 * dass sie bestimmte Methoden bereitstellen
 *
 * Vorteil:
 * eine Klasse kann mehrere Interfaces implementieren. Dies ermöglicht es,
 * Funktionalität von mehreren Quellen zu erben,
 * was die Flexibilität und Wiederverwendbarkeit des Codes erhöht.
 *
 * eine Klasse kann mehrere Interfaces implementieren. Dies ermöglicht es,
 * Funktionalität von mehreren Quellen zu erben,
 * was die Flexibilität und Wiederverwendbarkeit des Codes erhöht.
 *
 * erlauben es, neue Funktionen hinzuzufügen, ohne die bestehenden Klassen zu ändern
 *
 * Nachteile:
 * Zusätzlicher Code: Die Verwendung von Interfaces kann dazu führen,
 * dass mehr Code geschrieben werden muss
 *
 * Komplexität: Bei vielen Interfaces und
 * deren Implementierungen kann die Codebasis komplexer werden
 */
//________Erstellung des Interfaces für die Beschleunigung der Fahrzeuge
//ein Interface, was die Methode zum Beschleunigen der Fahrzeuge definiert
//somit kann ich eine Methode in der abstrakten Klasse Fahrzeug aufrufen
//bei der Wartung muss ich das später nur einmal fixen

