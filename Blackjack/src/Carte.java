
    class Carte implements CarteInterface{
       private String type;
      private  String valeur;

        public Carte(String type, String valeur) {
            this.type = type;
            this.valeur = valeur;
        }

        public String getType() {
            return type;
        }

        public String getValeur() {
            return valeur;
        }
    }

