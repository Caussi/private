public class Fraction {
    int numerateur;
    int denominateur;

    public Fraction(int numerateur,int denominateur){
    this.numerateur = numerateur;
    this.denominateur = denominateur;
    }

    public static int pgcd(int a, int b) {
        int c;
        while (b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public void setNumerateur(int numerateur) {
        this.numerateur = numerateur;
    }

    public void setDenominateur(int denominateur) {
        this.denominateur = denominateur;
    }

    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }
}