package at.qcademy.tasks.interfaces.aufgabe2;

    class BenutzerdefinierteChiffrierung implements Chiffrierung {
        private char[] geheimtextalphabet;

        public BenutzerdefinierteChiffrierung(char[] geheimtextalphabet) {
            if (geheimtextalphabet.length != 26) {
                throw new IllegalArgumentException("Das Geheimtextalphabet muss genau 26 Zeichen enthalten.");
            }
            this.geheimtextalphabet = geheimtextalphabet;
        }

        @Override
        public char chiffrieren(char zeichen) {
            if (Character.isLowerCase(zeichen)) {// Wenn Zeichen in Kleinbuchstaben ist
                int index = zeichen - 'a';// Index berechnen
                return geheimtextalphabet[index];
            } else {
                return zeichen; // Zeichen außerhalb der Kleinbuchstaben bleiben unverändert
            }
        }

        @Override//umgekehrt
        public char dechiffrieren(char zeichen) {
            if (Character.isLowerCase(zeichen)) {
                int index = new String(geheimtextalphabet).indexOf(zeichen);
                return (char) ('a' + index);
            } else {
                return zeichen; // Zeichen außerhalb der Kleinbuchstaben bleiben unverändert
            }
        }
    }



