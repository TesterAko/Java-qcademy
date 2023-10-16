package at.qcademy.tasks.oop.AbstrakteKlasseUebung;

    public class Motorrad extends FahrzeugMotorrad implements BeschleunigbarMotorrad {
    public int raederMotorrad;

    public Motorrad(String marke, int raederMotorrad) {//Konstruktor fÜr Motorrad
        this.marke = marke;
        this.raederMotorrad = raederMotorrad;
    }

        @Override
        public void motorradStarten() {
            System.out.println("Das Motorrad mit " + raederMotorrad + " Rädern startet");
        }
        @Override
        public void motorradBeschleunigen() {
            System.out.println("Das Motorrad beschleunigt");
        }

        @Override
        public void motorradFaehrt() {
            System.out.println("Das Motorrad fährt");
        }

        @Override
        public void motorradBremst() {
            System.out.println("Das Motorrad bremst");
        }

    }
