    import java.util.ArrayList;
import java.util.List;
class Main implements MainInterface {
    private int valeurTotal;
    private String nom;
    private int nbCartes;
    private List<Carte> listCartes;

    public Main() {
        this.valeurTotal = 0;
        this.nom = "";
        this.nbCartes = 0;
        this.listCartes = new ArrayList<>();
    }
@Override

    public void ajouterCarte(Carte carte) {
        listCartes.add(carte);

    }

    public String getNom() {
        return nom;
    }

    public int getNbCartes() {
        return nbCartes;
    }

    public int getValeurTotal() {
        return valeurTotal;
    }

    public List<Carte> getListCartes() {
        return listCartes;

    }



}