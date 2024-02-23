class Joueur extends Personne implements JoueurInterface {
    private Main main;
    private int solde;

    public Joueur(String username, int solde) {
        super(username);
        this.solde = solde;
        this.main = new Main();
    }
@Override
    public void placerMise(int mise) {
        solde -= mise;
    }
@Override
    public void recevoirCarte(Carte carte) {
        main.ajouterCarte(carte);
    }

    public int getSolde() {
        return solde;
    }
}
