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
        if(denominateur != 0){this.denominateur = denominateur;}
    }

    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    public void multiplierParCoeff(int a) {
        this.numerateur = this.numerateur * a;
    }

    public void inverse() {
        if(this.numerateur != 0) {
            int temp = this.numerateur;
            this.numerateur = this.denominateur;
            this.denominateur = temp;
        }
    }

    public boolean egaleA(Fraction f) {
        boolean r;
        r =  f.numerateur* this.denominateur == this.numerateur * f.denominateur;
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
        int pgcd1 = pgcd(this.numerateur, this.denominateur);
        int r = this.numerateur/pgcd1;
        int l = this.denominateur/pgcd1;
        this.numerateur = r;
        this.denominateur = l;

        if (this.numerateur < 0 && this.denominateur < 0){
            this.numerateur=abs(this.numerateur);
            this.denominateur=abs(this.denominateur);
        }
        else if(this.numerateur>0 && this.denominateur<0){
            this.numerateur = - this.numerateur;
            this.denominateur = abs(this.denominateur);
        }
    }

    public void ajoute(Fraction f){
        Fraction l = new Fraction(this.numerateur*f.denominateur + this.denominateur*f.numerateur, this.denominateur*f.denominateur);
        this.numerateur = l.numerateur;
        this.denominateur = l.denominateur;

    }
    public void soustrait(Fraction f){
        Fraction l = new Fraction(this.numerateur*f.denominateur - this.denominateur*f.numerateur, this.denominateur*f.denominateur);
        this.numerateur = l.numerateur;
        this.denominateur = l.denominateur;

    }
    public void multiplie(Fraction f){
        Fraction l = new Fraction(this.numerateur*f.numerateur, this.denominateur*f.denominateur);
        this.numerateur = l.numerateur;
        this.denominateur = l.denominateur;

    }

    public void divise(Fraction f){
        Fraction l = new Fraction(this.numerateur*f.denominateur, this.denominateur*f.numerateur);
        this.numerateur = l.numerateur;
        this.denominateur = l.denominateur;

    }
}


