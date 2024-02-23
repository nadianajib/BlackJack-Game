import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class paquetCarte implements paquetCarteInterface {
    List<Carte> listCartes;


    public void paquetCarte() {
        this.listCartes = new ArrayList<>();
        initialiserpaquet();


    }
@Override
    public void initialiserpaquet() {
        String[] types = {"Carreau", "Coeur", "Pique", "Trèfle"};
        String[] valeurs = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi"};
        for (String type : types) {
            for (String valeur : valeurs) {
                listCartes.add(new Carte(type, valeur));
            }
        }
        mélanger();    }
    @Override
    public void mélanger() {
        Collections.shuffle(listCartes);


    }
}

