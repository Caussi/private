import gestionVille.Bien


public class Bien {

    private int valEuros;
    private int coutEntetienMensuel;
    private static int nbExemplaires = 0;

    public Bien() {
        super();
        this.valEuros = 0;
        this.coutEntetienMensuel = 0;
        nbExemplaires++;
    }

    public Bien(int v, int c, int n) {
        this.valEuros = v;
        this.coutEntetienMensuel = c;
        Bien.nbExemplaires++;

    }


    public int getValEuros() {
        return valEuros;
    }

    public void setValEuros(int valEuros) {
        this.valEuros = valEuros;
    }

    public int getCoutEntretienMensuel() {
        return coutEntretienMensuel;
    }

    public void setCoutEntretienMensuel(int coutEntretienMensuel) {
        this.coutEntretienMensuel = coutEntretienMensuel;
    }

    public static int getNbExemplaires() {
        return nbExemplaires;
    }

    public String getInfo(){
        retrn "Bien : valEuro = "+this.valEuros+", cout entretien = "+this.coutEntetienMensuel;
    }

}

