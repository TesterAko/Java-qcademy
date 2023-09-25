package OOP.Koordinaten;

public class Punkt {
    //Attribute_________________________ Definierung der Attribute, was gehört zum Punkt
    double x;
    double y;

    //Konstruktor_________________________ Erstellung eines Punkts
    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Methoden________________________________ Was kann das Punkt?

    //Ausgabe_______________________________ Ausgabe des Punkts als String
    public String toString() {
        return "{\"x\": " + x + ", \"y\": " + y + "}";//Ausgabe JSON
    }

    //Abstand zum Ursprung______________________
    public double abstandZumUrsprung() {
        return Math.sqrt(this.x * this.x + this.y * this.y);//Mathematischer Formel für Quadratwurzel
    }

    //Spiegelung der x Achse mit neuem Punkt______________________
    public Punkt spiegelX() {
        this.x = -this.x;// durch - wird negiert also gespiegelt
        return new Punkt(this.x, this.y);//neuer Punkt durch Return new!
    }


    //Spiegelung der y Achse mit neuem Punkt______________________
    public Punkt spiegelY() {
        this.y = -this.y;// durch - wird negiert also gespiegelt
        return new Punkt(this.x, this.y);//neuer Punkt durch Return new!
    }

    /**
     * Einfacher und klarer als
     * public Punkt spiegelY() {
     * this.y = -this.y;
     * boolean spiegelY = true;
     * if (spiegelY == true) {
     * return new Punkt(this.x, this.y);
     * }
     * }
     */
    //Spiegelung des Punktes am Ursprung___________________________
    public Punkt spiegelAmUrsprung() {
        return new Punkt(-this.x, -this.y);//beide koordinaten werden mit - negiert
    }

    //Abstand zum anderen Punkt______________________________________
       public double abstandZu(Punkt andererPunkt) {
           double deltaX = this.x - andererPunkt.x;//Abstand von definiertem x zum anderen neuen x
           double deltaY = this.y - andererPunkt.y;//Abstand von definiertem y zum anderen neuen y

           return Math.sqrt(deltaX * deltaX + deltaY * deltaY);//Mathematischer Formel für Quadratwurzel
       }
   }




