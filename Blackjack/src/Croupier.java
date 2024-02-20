class Croupier extends Personne {
    int valeurTotalLimit;

    public Croupier(int valeurTotalLimit,String username) {
        super( username);
        this.valeurTotalLimit = valeurTotalLimit;
    }
}
