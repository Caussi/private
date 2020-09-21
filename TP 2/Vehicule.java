public class Vehicule extends Bien {

    private String numeroImatriculation;
    private int nbPlaces;

    public Vehicule() {

        super();
        this.numeroImatriculation = "";
        this.nbPlaces = 0;
    }

    public Vehicule(int i, int n) {
        this.numeroImatriculation = i;
        this.nbPlaces = n;
    }

    public String getNumeroImatriculation() {
        return numeroImatriculation;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public String getInfo() {
        return super.getInfo() + "Num Imatriculation :" + this.numeroImatriculation + ",nbr de places :" + this.nbPlaces;

    }
}
