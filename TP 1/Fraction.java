public class Fraction {
    int numerateur;
    int denominateur;

    public Fraction(int numerateur, int denominateur) {
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

    public void multiplierParCoeff(int a) {
        this.numerateur = numerateur * a;
    }

    public void inverse() {
        int temp = numerateur;
        numerateur = denominateur;
        denominateur = temp;
    }

    public boolean egaleA(Fraction f) {
        boolean r;
        r = this.numerateur * this.denominateur == f.numerateur * f.denominateur;
        return r;
    }

    int abs(int x) {
        if (x > 0) {
            return x;
        } else {
            return -x;
        }
    }
    public void reduire() {
        new Fraction(numerateur/ pgcd(abs(this.numerateur), abs(this.denominateur)),
                denominateur/ pgcd(abs(this.numerateur), abs(this.denominateur)));
    }

    public void ajoute(Fraction f){
        Fraction r = new Fraction (numerateur,denominateur);
        new Fraction(numerateur*f.denominateur + denominateur*f.numerateur, denominateur*f.denominateur);
        f.numerateur = this.numerateur * f.denominateur + f.numerateur * this.denominateur;
        f.denominateur = this.denominateur * f.denominateur;

    }
    public void soustrait(Fraction f){
        Fraction r = new Fraction(numerateur, denominateur);
        new Fraction(r.numerateur * f.denominateur - f.numerateur * r.denominateur, r.denominateur * f.denominateur);
    }
    public void multiplie(Fraction f){
        Fraction r = new Fraction(numerateur, denominateur);
        new Fraction(r.numerateur*f.denominateur, r.denominateur*f.denominateur);

    }

}




