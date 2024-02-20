import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collection;
public class paquetCarte {
    List<Carte> listCartes;


    public void PaquetCarte() {
        this.listCartes = new ArrayList<>();
        initialiserPaquet();


    }

    private void initialiserPaquet() {
        String[] types = {"Carreau", "Coeur", "Pique", "Trèfle"};
        String[] valeurs = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi"};
        for (String type : types) {
            for (String valeur : valeurs) {
                listCartes.add(new Carte(type, valeur));
            }
        }
        mélanger();    }

    public void mélanger() {
        Collections.shuffle(listCartes);


    }
}

