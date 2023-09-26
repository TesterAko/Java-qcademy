package at.qcademy.tasks.interfaces.aufgabe1;

 class Vinteger extends Integer implements Vergleichbar {
    public Vinteger(int w) {
        super(w);
    }

    @Override
    public int vergleichenMit(Vergleichbar obj) {
        if (obj instanceof Vinteger) {//wenn obj vom Typ VInteger ist
            Vinteger other = (Vinteger) obj;// das Objekt von Interface Vergleichbar,wird vom other zum Typ VInteger konvertiert, Type-Casting (downcasting)
            if (this.wert < other.getWert()) {//wenn this.wert kleiner als other.wert ist
                return -1;//dann return -1
            } else if (this.wert == other.getWert()) {//wenn this.wert gleich other.wert ist
                return 0;//dann return 0
            } else { //sonst gib zurück
                return 1;
            }
        }
        throw new IllegalArgumentException("Objekt ist nicht vom Typ VInteger");
    }
}

