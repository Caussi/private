package gestionVille;

import java.util.Arraylist;

public class Ville {
    private ArrayList<Bien> tabBien;

    public Ville() {
        tbBien = new ArrayList<Bien>();
    }

    public Ville(ArrayList<Bien> b) {
        tabBien = new ArrayList<Bien>(b);
    }

    public String getInfo(int indice) {
        return tabBien.get(indice).getInfo();

    }

    public int getNbVehicule() {
        int nbVehicule = 0;
        for (Bien b : tabBien) {
            if (b instance of Vehicule)
            nbVehicule++;

        }
        return nbVehicule;
    }

    public int getCoutEntretienMensuel() {
        int CoutEntretienMensuel = 0;
        for (Bien b : tabBien) {
            CoutEntretienMensuel += b.getCoutEntretienMensuel();
        }
        return CoutEntretienMensuel;
    }

    // exemple avec une classe véhicule, appelle à la classe fille

    public int getNbTotalPlaceVehicule() {
        int nbPlace = 0;
        for (Bien b : tabBien) {
            if (b instanceof Vehicule)
                nbPlace += ((Vehicule) b).getNblaces()
        }
        return nbPlace;
    }
}