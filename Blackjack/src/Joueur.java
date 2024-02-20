class Joueur extends Personne {
    private Main main;
    private int solde;

    public Joueur(String username, int solde) {
        super(username);
        this.solde = solde;
        this.main = new Main();
    }

    public void placerMise(int mise) {
        solde -= mise;
    }

    public void recevoirCarte(Carte carte) {
        main.ajouterCarte(carte);
    }

    public int getSolde() {
        return solde;
    }
}
