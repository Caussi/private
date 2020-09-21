public class Logement extends Bien {
    private int SuperficieAuSol;
    private int nbPersonneLogees;

    public Logement() {
        super();
        this.SuperficieAuSol = 0;
        this.nbPersonneLogees = 0;
    }

    public Logement(s, n) {
        this.SuperficieAuSol = s;
        this.nbPersonneLogees = n;
    }

    public int getSuperficieAuSol() {
        return SuperficieAuSol;
    }

    public int getNbPersonneLogees() {
        return nbPersonneLogees;
    }

}