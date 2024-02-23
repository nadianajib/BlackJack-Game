class Croupier extends Personne  implements CroupierInterface{
    int valeurTotalLimit;

    public Croupier(int valeurTotalLimit,String username) {
        super( username);
        this.valeurTotalLimit = valeurTotalLimit;
    }
}
