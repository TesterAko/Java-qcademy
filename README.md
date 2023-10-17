# Java-qcademy

@Override
public String toJson() {
return "{\"stossDaempfer\": \"" + this.stossDaempfer + "\", \"fahrzeug\": " + super.toJson() + "}";
}//den rest nach Fahrzeug nimmt er vom Konstruktor der superklasse Fahrzeug 